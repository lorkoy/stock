package com.stock.data.queen.work;

import java.util.concurrent.BlockingQueue;

import com.stock.dto.Message;


public class SaveStockData<T> extends Worker<T> {
	
	public SaveStockData(BlockingQueue<T> queen){
		super(queen);
	}

	@Override
	void doWork(Object t) {
		// TODO 具体业务
		Message msg = (Message) t;
		System.out.println(msg.getCode());
	}

}
