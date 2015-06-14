/**
 * 
 */
package com.stock.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author think
 *
 */
public class CacheManager {
	
	private static CacheManager manager;
	private Map<String,Object> cache = new ConcurrentHashMap<String, Object>();
	
	private CacheManager(){
		
	}
	
	public static CacheManager getInstance(){
		if(manager == null){
			manager = new CacheManager();
		}
		return manager;
	}

	/**
	 * @return the cache
	 */
	public Map<String,Object> getCache() {
		return cache;
	}

	/**
	 * @param cache the cache to set
	 */
	public void setCache(Map<String,Object> cache) {
		this.cache = cache;
	}

}
