package com.stock.job;

import java.util.Calendar;
import java.util.Date;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.stock.data.biz.DataService;
import com.stock.dto.StockCode;
import com.stock.spring.ApplicationContextHodler;

@Configuration
@EnableScheduling
@Lazy(false)
public class StockDataJob {
	private static final Logger logger = LoggerFactory.getLogger(StockDataJob.class);

	@Autowired
	private DataService dataService;
	

	/**
	 * @author ray 每分钟获取一次股票实时数据 
	 * 2015年6月11日 下午1:46:41
	 */
	// @Scheduled(cron="0 0/1,30,00 9,13 ? * MON-FRI")
	@Scheduled(cron = "0 0/1,* * ? * MON-FRI")
	public void stockDataJob() {
//		jobSwith();
		logger.debug("get stock data job start at {}", new Date());
		dataService.service();
	}

	
	/**
	 * 任务调度
	 *@author ray
	 * 
	 *@date 2015年6月14日 上午12:35:17
	 */
	public void jobSwith() {
		Calendar cal = Calendar.getInstance();
		int min = cal.get(Calendar.MINUTE);
		if (min == 40) {
			try {
				Scheduler job = (Scheduler) ApplicationContextHodler.getBean("scheduler");
				job.shutdown();
				logger.info("get stock data job stop at {}", new Date());
			} catch (SchedulerException e) {
				e.printStackTrace();
			}

		}

	}

}
