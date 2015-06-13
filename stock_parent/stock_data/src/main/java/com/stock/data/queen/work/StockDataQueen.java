package com.stock.data.queen.work;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.stock.dto.StockCode;

public class StockDataQueen {
	
	private BlockingQueue<StockCode> queen;
	private ExecutorService executorService;
	private int poolSize = 35;
	
	public StockDataQueen(){
		this.queen = new LinkedBlockingQueue<StockCode>();
		executorService = Executors.newCachedThreadPool();
	}
	
	
	public void startWork(){
		for(int i=0;i<poolSize;i++){
			SaveStockDataWorker command = new SaveStockDataWorker(queen);
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
		return queen;
	}

	public void setQueen(BlockingQueue<StockCode> queen) {
		this.queen = queen;
	}

}
