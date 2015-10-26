/**
 * 
 */
package com.stock.data.biz;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.stock.cache.CacheManager;
import com.stock.data.thread.BankrollWorker;
import com.stock.db.entity.Bankroll;
import com.stock.db.entity.Stock;
import com.stock.db.mybatis.BankrollMapper;
import com.stock.util.DateUtils;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;

/**
 * @author think
 *
 */
@Service
@Transactional(isolation=Isolation.READ_COMMITTED)
public class BankrollService {
	private Logger logger = LoggerFactory.getLogger(BankrollService.class);
	
	@Resource
	private BankrollMapper bankrollMapper;
	
	public void bankrollData(List<Stock> stocks){
		
		List<Bankroll> records = new ArrayList<Bankroll>();
		int i = 0;
			for(Stock s:stocks){
				i++;
				String code = s.getCode();
				String result = "";
				try {
					result = queryBankroll(code);
					if(result.length() == 0){
						continue;
					}
					String[] info = result.substring(result.indexOf("{"), result.indexOf("}")-1).split("\"")[1].split(",");
					Calendar cal = Calendar.getInstance();
					String date = cal.get(Calendar.YEAR)+"-"+result.split("=")[1].split(";")[1].split("\n")[0].split("Create:")[1];
					Date d = DateUtils.parseDate(date, "yyyy-MM-dd HH:mm:ss");
					cal.setTime(d);
					BigDecimal largeIn = new BigDecimal(info[12]);
					BigDecimal largeOut = new BigDecimal(info[13]);
					BigDecimal bigIn = new BigDecimal(info[14]);
					BigDecimal bigout = new BigDecimal(info[15]);
					if(largeIn.doubleValue() != 0){
						Bankroll br = new Bankroll();
						br.setLargeIn(info[12]);
						br.setLargeOut(info[13]);
						br.setBigIn(info[14]);
						br.setBigOut(info[15]);
						br.setMediumIn(info[16]);
						br.setMediumOut(info[17]);
						br.setSmallIn(info[18]);
						br.setSmallOut(info[19]);
						br.setMainforceIn(largeIn.add(bigIn).toString());
						br.setMainforceOut(largeOut.add(bigout).toString());
						br.setCreateDate(new Date());
						br.setStockCode(code);
						br.setYear(String.valueOf(cal.get(Calendar.YEAR)));
						br.setMonth(String.valueOf(cal.get(Calendar.MONTH)+1));
						br.setDate(date);
						records.add(br);
					}else{
						logger.debug("code : {} 停牌，没有资金流入",code);
					}
					if(i == stocks.size()-1){
						bankrollMapper.batchInsert(records);
						records.clear();
					}
//					if(records.size() == 50){
//						bankrollMapper.batchInsert(records);
//						records.clear();
//					}
					
				} catch (FileNotFoundException e) {
					logger.error("code : {} 已退市",code);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
	}
	
	public String queryBankroll(String code) throws Exception {
		String url = PropertiesUtil.getInstance().get("capital_info_url");
		StringBuffer sb = new StringBuffer(url);
		sb.replace(sb.indexOf("{stockCode}"), sb.indexOf("{stockCode}")+"{stockCode}".length(), code);
		sb.replace(sb.indexOf("{rt}"), sb.length(), "1");
		String result = HttpUtils.sendHttpRequest(sb.toString(),"utf-8");
		return result;
	}
	
	public static void main(String[] args) {
		Double d = Double.parseDouble("-7378.16");
		System.out.println(d);
	}
	
	public void handlerBandroll(){
		int handlNum = 50;
		List<Stock> stocks = CacheManager.getInstance().getCache().get("code");
		for(int i = 1;i<stocks.size()/handlNum;i++){
			List<Stock> subStocks= stocks.subList((i-1)*50+1, i*handlNum);
			BankrollWorker worker = new BankrollWorker(subStocks);
			Thread t = new Thread(worker);
			t.start();
		}
		
		
		
		
		
	}
	
}
