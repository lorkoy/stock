package com.stock.data.queen.work;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.stock.dto.StockCode;

public class StockDataQueen {
	
	private BlockingQueue<StockCode> queen;
	private ThreadPoolExecutor executor;
	private int poolSize = 10;
	
	public StockDataQueen(){
		this.queen = new LinkedBlockingQueue<StockCode>();
		this.executor = new ThreadPoolExecutor(poolSize, 10, 200,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100));
	}
	
	
	public void startWork(){
		for(int i=0;i<poolSize;i++){
			SaveStockDataWorker command = new SaveStockDataWorker(queen);
			executor.execute(command);
		}
	}
	
	
	
	private static class SingletonHolder {
		private static StockDataQueen instance = new StockDataQueen();
	}

	public static StockDataQueen getInstance() {
		return SingletonHolder.instance;
	}

	public BlockingQueue<StockCode> getQueen() {
		return queen;
	}

	public void setQueen(BlockingQueue<StockCode> queen) {
		this.queen = queen;
	}

}
