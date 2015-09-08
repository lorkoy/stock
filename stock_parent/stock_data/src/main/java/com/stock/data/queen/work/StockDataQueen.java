package com.stock.data.queen.work;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.stock.dto.StockCode;

public class StockDataQueen {
	//每分钟查询股票价格的队列
	private BlockingQueue<StockCode> minQueen;
	//每30分钟查询股票价格的队列
	private BlockingQueue<StockCode> halfHourQueen;
	//每小时查询股票价格的队列
	private BlockingQueue<StockCode> hourQueen;
	//每两小时查询股票价格的队列
	private BlockingQueue<StockCode> twoHourQueen;
	private ExecutorService executorService;
	private int poolSize = 35;
	
	public StockDataQueen(){
		this.minQueen = new LinkedBlockingQueue<StockCode>();
		executorService = Executors.newCachedThreadPool();
	}
	
	
	public void startWork(){
		for(int i=0;i<poolSize;i++){
			MinStockDataWorker command = new MinStockDataWorker(minQueen);
			executorService.execute(command);
		}
	}
	
	
	
	private static class SingletonHolder {
		private static StockDataQueen instance = new StockDataQueen();
	}

	public static StockDataQueen getInstance() {
		return SingletonHolder.instance;
	}

	public BlockingQueue<StockCode> getQueen() {
		return minQueen;
	}

	public void setQueen(BlockingQueue<StockCode> queen) {
		this.minQueen = queen;
	}

}
