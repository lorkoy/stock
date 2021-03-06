package com.stock.data.queen.work;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stock.db.entity.StockInfo;
import com.stock.db.mybatis.StockInfoMapper;
import com.stock.spring.ApplicationContextHodler;
import com.stock.util.DateUtils;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;
import com.stock.util.StringUtil;

public abstract class Worker<T> implements Runnable{
	
	public StockInfoMapper stockInfoMapper =(StockInfoMapper) ApplicationContextHodler.getBean("stockInfoMapper");
	
	private static final Logger logger = LoggerFactory.getLogger(Worker.class);
	
	private BlockingQueue<T> queue;
	
	public Worker(){
		
	}
	
	public Worker(BlockingQueue<T> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				doWork(queue.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 从新浪获取股票数据
	 * http://hq.sinajs.cn/list=
	 * @param code
	 * @return
	 * @throws IOException
	 */
	public List<StockInfo> queryStockInfo(String code) throws IOException{
		List<StockInfo> stocks = new ArrayList<StockInfo>();
		try {
			String[] result = HttpUtils.sendHttpRequest(PropertiesUtil.getInstance().get("stock_info_url")+ code,"gbk").split("var hq_str");
			for(String str:result){
				String[] info = str.split("=");
				if (info.length >= 2&& StringUtil.replaceBlank(info[1]).length()>8) {
					logger.info("query stock info result is {} and result length is {}",info[1], info[1].length());
					StockInfo stock = createStockInfo(info[1],info[0].substring(3,info[0].length()));
					stocks.add(stock);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stocks;
	}
	/*	*
   	0：”大秦铁路”，股票名字；
	1：”27.55″，今日开盘价；
	2：”27.25″，昨日收盘价；
	3：”26.91″，当前价格；
	4：”27.55″，今日最高价；
	5：”26.20″，今日最低价；
	6：”26.91″，竞买价，即“买一”报价；
	7：”26.92″，竞卖价，即“卖一”报价；
	8：”22114263″，成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
	9：”589824680″，成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
	10：”4695″，“买一”申请4695股，即47手；
	11：”26.91″，“买一”报价；
	12：”57590″，“买二”
	13：”26.90″，“买二”
	14：”14700″，“买三”
	15：”26.89″，“买三”
	16：”14300″，“买四”
	17：”26.88″，“买四”
	18：”15100″，“买五”
	19：”26.87″，“买五”
	20：”3100″，“卖一”申报3100股，即31手；
	21：”26.92″，“卖一”报价
	(22, 23), (24, 25), (26,27), (28, 29)分别为“卖二”至“卖四的情况”
	30：”2008-01-11″，日期；
	31：”15:05:32″，时间
	*/
	public StockInfo createStockInfo(String info,String code){
		StockInfo sc = new StockInfo();
		String[] infos = info.split(",");
		sc.setId(UUID.randomUUID().toString());
		sc.setCode(code);
		sc.setName(infos[0].substring(1,infos[0].length()));
		sc.setOpen(infos[1]);
		sc.setPreclose(infos[2]);
		sc.setCurrent(infos[3]);
		sc.setHighest(infos[4]);
		sc.setLowest(infos[5]);
		sc.setVol(infos[8]);
		sc.setClosingcost(infos[9]);
		String dateStr = infos[30]+" "+infos[31];
		Date date = DateUtils.parseDate(infos[30], "yyyy-MM-dd");
		sc.setDate(date);
		//UNIX 时间戳
		long unitStamp = DateUtils.parseDate(dateStr, "yyyy-MM-dd HH:mm:ss").getTime()/1000;
		sc.setTime(String.valueOf(unitStamp));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		sc.setWeek(cal.get(Calendar.WEEK_OF_YEAR));
		return sc;
	}
	
	abstract void doWork(T t);

}
