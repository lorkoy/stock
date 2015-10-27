package com.stock.data.queen.work;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stock.db.entity.StockInfo;
import com.stock.dto.StockCode;
import com.stock.exception.ExUtils;


public class MinStockDataWorker extends Worker<StockCode> {
	
	private static final Logger logger = LoggerFactory.getLogger(MinStockDataWorker.class);
	
	public MinStockDataWorker(BlockingQueue<StockCode> queen){
		super(queen);
	}
	
	@Override
	void doWork(StockCode code) {
		try {
			final List<StockInfo> stocks = super.queryStockInfo(code.getCode());
			stockInfoMapper.batchInsert(stocks);
		} catch (Exception e) {
			logger.error(ExUtils.printExAsString(e));
		}
		
	}
	
}
