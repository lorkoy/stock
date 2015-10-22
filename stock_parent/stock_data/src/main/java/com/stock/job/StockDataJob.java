package com.stock.job;

import java.util.Calendar;
import java.util.Date;

import org.apache.catalina.tribes.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.stock.data.biz.DataService;
import com.stock.db.entity.Bankroll;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;

@Configuration
@EnableScheduling
@Lazy(false)
public class StockDataJob{
	private static final Logger logger = LoggerFactory.getLogger(StockDataJob.class);

	@Autowired
	private DataService dataService;
	

	/**
	 * @author ray 每分钟获取一次股票实时数据 
	 * 2015年6月11日 下午1:46:41
	 */
//	 @Scheduled(cron="0 0/1,0,38 13-21 ? * MON-FRI")
	@Scheduled(cron="0 0/1,* * ? * MON-FRI")
	public void stockDataJob() {
		if(jobSwith()){
			logger.info("get stock data job start at {}", new Date());
			dataService.service();
		}
	}

	
	/**
	 * 任务调度
	 *@author ray
	 * 
	 *@date 2015年6月14日 上午12:35:17
	 */
	public boolean jobSwith() {
//		Calendar cal = Calendar.getInstance();
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
//		int min = cal.get(Calendar.MINUTE);
//		if(hour == 11 && min >30 ){
//			return false;
//		}
//		if(hour >11 && hour <13){
//			return false;
//		}
//		
//		if(hour >15){
//			return false;
//		}
//		
//		if(hour >=15 && min > 1){
//			return false;
//		}
//		//股票信息有滞后性，所以15:10再查询一次
//		if(hour == 15 && min == 10){
//			return true;
//		}
		return true;
	}
	
	/**
	 * 资金流向
	 *@author ray
	 * 
	 *2015年8月21日 下午1:45:47
	 */
	@Scheduled(cron="0 * 20 0/1 * MON-FRI")
	public void saveCapital(){
		String url = PropertiesUtil.getInstance().get("capital_info_url");
		StringBuffer sb = new StringBuffer(url);
		sb.replace(sb.indexOf("{stockCode}"), sb.indexOf("{stockCode}")+"{stockCode}".length(), "601989");
		sb.replace(sb.indexOf("{rt}"), sb.length(), "1");
		try {
			String result = HttpUtils.sendHttpRequest(sb.toString(),"gbk");
			String[] info = result.split("\n");
			System.out.println(info[info.length-2]);
			System.out.println(Arrays.toString(info));
			Bankroll br = new Bankroll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
