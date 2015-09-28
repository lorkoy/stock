/**
 * 
 */
package com.stock.job;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.log.Log;
import com.stock.SpringTestCase;
import com.stock.util.HttpUtils;

/**
 * @author think
 *
 */
//@ContextConfiguration({ "/spring/applicationContext.xml" })
public class JobTest{
	
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
	
	public static void main(String[] args) throws IOException, InterruptedException {
		int start =15001;
		int end = 19000;
		CountDownLatch latch = new CountDownLatch(end-start);
		String _url = "http://passenger.01zhuanche.com/car-rest/webservice/order/token=zQw&clientType=0&orderId=";
		String path = "e:"+File.separator+"2.txt";
		Map<String, String> content = new Hashtable<String, String>();
//		long start = System.currentTimeMillis();
		for(int i = start;i<=end;i++){
			String url = _url+i;
			Bot bot = new Bot(url,content,latch);
			Thread t = new Thread(bot);
			t.start();
		}
		
//		long end = System.currentTimeMillis();
//		System.out.println("信息收集完毕："+(end-start)/1000);
		latch.await();
		File file = new File(path);
		FileWriter fos = new FileWriter(file,true);
		System.out.println(content.size());
		for(String key:content.keySet()){
			fos.write(content.get(key));
			fos.write("\n");
		}
		fos.close();
	}
	
	

}
