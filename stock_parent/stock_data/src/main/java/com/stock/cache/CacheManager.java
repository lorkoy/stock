/**
 * 
 */
package com.stock.cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.stock.db.entity.Stock;

/**
 * @author think
 *
 */
public class CacheManager {
	
	private static CacheManager manager;
	private Map<String,List<Stock>> cache = new ConcurrentHashMap<String, List<Stock>>();
	
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
	public Map<String,List<Stock>> getCache() {
		return cache;
	}

	/**
	 * @param cache the cache to set
	 */
	public void setCache(Map<String,List<Stock>> cache) {
		this.cache = cache;
	}

}
