package com.stock.job;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.catalina.tribes.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.stock.data.biz.BankrollService;
import com.stock.data.biz.DataService;
import com.stock.db.entity.Bankroll;
import com.stock.util.DateUtils;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;

@Configuration
@EnableScheduling
@Lazy(false)
public class StockDataJob{
	private static final Logger logger = LoggerFactory.getLogger(StockDataJob.class);

	@Autowired
	private DataService dataService;
	
	@Autowired
	private BankrollService bankrollService;

	/**
	 * @author ray 每分钟获取一次股票实时数据 
	 * 2015年6月11日 下午1:46:41
	 */
//	 @Scheduled(cron="0 0/1,0,38 13-21 ? * MON-FRI")
//	@Scheduled(cron="0 0/1,* * ? * MON-FRI")
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
		bankrollService.handlerBandroll();
	}

	public static void main(String[] args) {
		String result = "";
		try {
			String url = "http://quote.eastmoney.com/sh600150.html?StockCode=600150";
			result = HttpUtils.sendHttpRequest(url, "gbk");
//			System.out.println(result.contains("45038"));
//			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String regex = "<script\\s.*?src=\"([^\"]+)\"[^>]*>(.*?)</script>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(result);
		String _url = "";
		try {
			while (matcher.find()) {
				 _url = matcher.group(1);
				if(_url.contains("http")){
					String _result = HttpUtils.sendHttpRequest(_url, "gbk");
					if(_result.contains("hz_b") && _result.contains("hz_a")){
						System.out.println(_result);
						System.out.println(_url);
					}
					
				}
			}
		} catch (Exception e) {
			System.out.println("error url is ======================= "+_url);
			e.printStackTrace();
		}
	}
}
