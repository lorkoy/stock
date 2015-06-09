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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.stock.data.Common;
import com.stock.db.entity.StockInfo;
import com.stock.db.mybatis.StockInfoMapper;
import com.stock.dto.Message;
import com.stock.exception.ExUtils;

public class SaveStockData<T> extends Worker<T> {
	
	@Autowired
	private StockInfoMapper stockInfoMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(SaveStockData.class);
	
	public SaveStockData(BlockingQueue<T> queen){
		super(queen);
	}

	@Override
	void doWork(Object t) {
		Message msg = (Message) t;
		try {
			List<StockInfo> stocks = queryStockInfo(msg.getMsg());
//			for(StockInfo stock:stocks){
//				stockInfoMapper.insertSelective(stock);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
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
			e.printStackTrace();
		}finally{
			if(is != null){
				is.close();
			}
		}
		
		return stocks;
	}
	

}
