/**
 * 
 */
package com.stock.job;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.tribes.util.Arrays;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.stock.SpringTestCase;
import com.stock.cache.CacheManager;
import com.stock.data.biz.BankrollService;
import com.stock.db.entity.Bankroll;
import com.stock.db.entity.Stock;
import com.stock.util.DateUtils;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;

/**
 * @author think
 *
 */
@ContextConfiguration({ "/spring/applicationContext.xml" })
public class JobTest extends SpringTestCase{
	@Resource
	private BankrollService bankrollService;
	
//	@Test
//	@Scheduled(cron="* 0/1 * * * *")
//	@Lazy(true)
//	public void jobTest(){
//		System.out.println("job start ..."+new Date());
//	}
//	
//	
	@Test
	public void testService(){
		System.out.println("test");
	}
	
	@Test
	public  void insertBR() throws IOException, InterruptedException {
		try {
			bankrollService.handlerBandroll();
//			String result = bankrollService.queryBankroll("600439");
//			System.out.println("============================================");
//			System.out.println(result);
//			System.out.println(result.contains("6102"));
//			System.out.println(result.split("=")[1].split(";")[0].split("\"")[1]);
//			System.out.println("============================================");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
