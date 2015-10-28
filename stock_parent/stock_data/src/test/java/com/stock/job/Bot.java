/**
 * 
 */
package com.stock.job;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.util.HttpUtils;

/**
 * @author think
 *
 */
public abstract class Bot implements Runnable{
	String url = "";
	@SuppressWarnings("rawtypes")
	Map map;
	
	/**
	 * 
	 */
	public Bot(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		sentPost();
		long end = System.currentTimeMillis();
		System.out.println("bot 收集完毕，用时："+(end-start)/1000);
		handlerResult();
	}
	
	
	
	private void sentPost(){
		try {
			String result = HttpUtils.sendHttpRequest(url, "utf-8");
			if(!StringUtils.isEmpty(result)){
				
				ObjectMapper mapper = new ObjectMapper();
				map = mapper.readValue(result, Map.class);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	abstract void handlerResult();
}
