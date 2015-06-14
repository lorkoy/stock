package com.stock.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.stock.cache.CacheManager;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.db.entity.Stock;
import com.stock.db.entity.StockExample;
import com.stock.db.mybatis.StockMapper;
import com.stock.job.StockDataJob;

@Component
@Lazy(false)
public class InitSystem implements ApplicationListener<ContextRefreshedEvent>{
	private static final Logger logger = LoggerFactory.getLogger(StockDataJob.class);
	
	@Autowired
	private StockMapper stockMapper;


	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		if(arg0.getApplicationContext().getParent() == null){
			startWork();
			loadStockCode();
		}
	}
	
	
	private void startWork(){
		StockDataQueen.getInstance().startWork();
		logger.info("init worker finished");
	}
	
	private void loadStockCode(){
		StockExample example = new StockExample();
		example.createCriteria();
		List<Stock> stocks = stockMapper.selectByExample(example);
		CacheManager.getInstance().getCache().put("code", stocks);
		logger.info("init stock code finished");
	}

}
