/**
 * 
 */
package com.stock.job;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.catalina.tribes.util.Arrays;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.StringUtils;

import com.stock.SpringTestCase;
import com.stock.db.entity.Bankroll;
import com.stock.db.mybatis.BankrollMapper;
import com.stock.util.HttpUtils;
import com.stock.util.PropertiesUtil;
import com.stock.util.StringUtil;

/**
 * @author think
 *
 */
@ContextConfiguration({ "/spring/applicationContext.xml" })
@
public class JobTest extends SpringTestCase{
	@Resource
	private BankrollMapper bankrollMapper;
	
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
		String url = PropertiesUtil.getInstance().get("capital_info_url");
		StringBuffer sb = new StringBuffer(url);
		sb.replace(sb.indexOf("{stockCode}"), sb.indexOf("{stockCode}")+"{stockCode}".length(), "601989");
		sb.replace(sb.indexOf("{rt}"), sb.length(), "1");
		try {
			String result = HttpUtils.sendHttpRequest(sb.toString(),"gbk");
			String[] info = result.split("\n");
//			System.out.println(info[info.length-2]);
//			System.out.println(Arrays.toString(info));
			String[] brStr = info[info.length-2].split(";");
			Bankroll br = new Bankroll();
			br.setMainforce(brStr[1]);
			br.setLarge(brStr[2]);
			br.setBig(brStr[3]);
			br.setMedium(brStr[4]);
			br.setSmall(brStr[5]);
			br.setCreateDate(new Date());
			br.setStockCode("601189");
			bankrollMapper.insert(br);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
