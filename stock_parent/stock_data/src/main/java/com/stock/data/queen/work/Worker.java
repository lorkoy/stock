package com.stock.data.queen.work;

import java.util.concurrent.BlockingQueue;

public abstract class Worker<T> implements Runnable{
	private BlockingQueue<T> queue;
	
	public Worker(){
		
	}
	
	public Worker(BlockingQueue<T> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				doWork(queue.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	abstract void doWork(T t);

}
