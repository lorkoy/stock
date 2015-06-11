/**
 * 
 */
package com.stock.job;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author think
 *
 */
@ContextConfiguration({ "/applicationContext.xml" })
public class JobTest extends AbstractJUnit4SpringContextTests{
	
	@Scheduled(cron="* 0/1 * * * *")
	@Lazy
	public void jobTest(){
		
	}

}
