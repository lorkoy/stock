package com.stock.data.queen.work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stock.data.Common;
import com.stock.db.entity.StockInfo;
import com.stock.db.mybatis.StockInfoMapper;
import com.stock.dto.StockCode;
import com.stock.exception.ExUtils;
import com.stock.spring.ApplicationContextHodler;


public class SaveStockDataWorker extends Worker<StockCode> {
	
	private static final Logger logger = LoggerFactory.getLogger(SaveStockDataWorker.class);
	
	public SaveStockDataWorker(BlockingQueue<StockCode> queen){
		super(queen);
	}
	
	@Override
	void doWork(StockCode code) {
		StockInfoMapper stockInfoMapper = (StockInfoMapper) ApplicationContextHodler.getBean("stockInfoMapper");
		try {
			List<StockInfo> stocks = queryStockInfo(code.getCode());
			for(StockInfo stock:stocks){
				stockInfoMapper.insertSelective(stock);
			}
		} catch (IOException e) {
			logger.error(ExUtils.printExAsString(e));
			logger.debug(ExUtils.printExAsString(e));
		}
		
	}
	
	/**
	 * 从新浪获取股票数据
	 * @param code
	 * @return
	 * @throws IOException
	 */
	public List<StockInfo> queryStockInfo(String code) throws IOException{
		List<StockInfo> stocks = new ArrayList<StockInfo>();
		InputStream is = null;
		byte[] b = new byte[256];
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			URL url = new URL(Common.STOCK_URL+code);
			is = url.openStream();
			int i = -1;
			while((i = is.read(b)) != -1){
				out.write(b,0,i);
			}
			String[] result = out.toString().split("var hq_str");
			for(String str:result){
				String[] info = str.split("=");
				if(info.length>1){
					StockInfo stock = new StockInfo(info[1]);
					stocks.add(stock);
				}
			}
		} catch (Exception e) {
			logger.error(ExUtils.printExAsString(e));
			logger.debug(ExUtils.printExAsString(e));
		}finally{
			if(is != null){
				is.close();
			}
		}
		
		return stocks;
	}
	

}
