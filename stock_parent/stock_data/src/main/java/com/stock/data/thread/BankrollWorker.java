/**
 * 
 */
package com.stock.data.thread;

import java.util.List;

import com.stock.cache.CacheManager;
import com.stock.data.biz.BankrollService;
import com.stock.db.entity.Stock;
import com.stock.spring.ApplicationContextHodler;

/**
 * @author think
 *
 */
public class BankrollWorker implements Runnable{
	private List<Stock> stocks;
	
	public BankrollWorker(List<Stock> stocks){
		this.stocks = stocks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BankrollService bankrollService = (BankrollService)ApplicationContextHodler.getBean("bankrollService");
		bankrollService.bankrollData(stocks);
	}

}
