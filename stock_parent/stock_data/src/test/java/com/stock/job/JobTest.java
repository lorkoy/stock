/**
 * 
 */
package com.stock.job;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;

import com.stock.SpringTestCase;

/**
 * @author think
 *
 */
@ContextConfiguration({ "/spring/applicationContext.xml" })
public class JobTest extends SpringTestCase{
	
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
	
	
	
	

}
