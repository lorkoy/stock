package com.stock.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.stock.data.queen.work.StockDataQueen;
import com.stock.job.StockDataJob;

@Component
@Lazy(false)
public class InitEnv implements ApplicationListener<ContextRefreshedEvent>{
	private static final Logger logger = LoggerFactory.getLogger(StockDataJob.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		if(arg0.getApplicationContext().getParent() == null){
			startWork();
		}
	}
	
	
	private void startWork(){
		StockDataQueen.getInstance().startWork();
		logger.info("init worker finished");
	}

}
