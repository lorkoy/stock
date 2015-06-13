/**
 * 
 */
package com.stock.data;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.stock.SpringTestCase;
import com.stock.data.biz.DataService;

/**
 * @author think
 *
 */
@ContextConfiguration({ "/spring/applicationContext.xml" })
public class DateServiceTest extends SpringTestCase{
	
	@Autowired
	private DataService dataService;
	
	@Test
	public void testParse(){
		try {
			Map<String, List<String>> stockCode = dataService.parseStockCode();
			List<String> sz = stockCode.get("sz");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
