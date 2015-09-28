/**
 * 
 */
package com.stock.job;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.util.HttpUtils;

/**
 * @author think
 *
 */
public class Bot implements Runnable{
	private String url = "";
	private Map<String, String> content;
	private CountDownLatch latch;
	
	/**
	 * 
	 */
	public Bot(String url,Map<String, String> content,CountDownLatch latch) {
		this.url = url;
		this.content = content;
		this.latch = latch;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		handlerMessage();
		long end = System.currentTimeMillis();
		System.out.println("bot 收集完毕，用时："+(end-start)/1000);
		
	}
	
	
	
	private void handlerMessage(){
		try {
			String result = HttpUtils.sendHttpRequest(url, "utf-8");
			if(!StringUtils.isEmpty(result)){
				String phone = "";
				String userId = "";
				String bookingDate = "";
				ObjectMapper mapper = new ObjectMapper();
				Map map = mapper.readValue(result, Map.class);
				Map orderInfo = (Map) map.get("order");
				if(!CollectionUtils.isEmpty(orderInfo)){
					for(Object key:orderInfo.keySet()){
						String keyStr = key.toString();
						if(keyStr.equals("bookingUserPhone")){
							phone = orderInfo.get(key).toString();
						}
						if(keyStr.equals("bookingUserId")){
							userId = orderInfo.get(key).toString();
						}
						if(keyStr.equals("bookingDate")){
							bookingDate = orderInfo.get(key).toString();
						}
					}
					System.out.println(url);
					content.put(phone, phone+"-"+userId+"-"+bookingDate);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			latch.countDown();
		}
	}
}
