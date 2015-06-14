package com.stock.data.biz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.stock.cache.CacheManager;
import com.stock.data.Common;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.db.entity.Stock;
import com.stock.db.entity.StockExample;
import com.stock.db.mybatis.StockMapper;
import com.stock.dto.StockCode;
import com.stock.exception.ExUtils;


@Component("dataService")
@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
public class DataService {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(DataService.class);
	private static final int count = 50;
	
	public void service(){
		try {
			parseStockCode();
		} catch (Exception e) {
			logger.error(ExUtils.printExAsString(e));
			logger.debug("parse code error");
		}
		
	}
	
	/**
	 * 将股票代码组装成请求需要的格式
	 *@author ray
	 *@throws Exception
	 * 
	 *2015年6月14日 上午12:13:30
	 */
	private void parseStockCode() throws Exception{
		int counter = 0;
		
		@SuppressWarnings("unchecked")
		List<Stock> stocks = (List<Stock>) CacheManager.getInstance().getCache().get("code");
		String codeStr = "";
		for(int i = 0;i<stocks.size();i++){
			Stock s = stocks.get(i);
			String temp = s.getCode();
			String stockCode = "";
			if(temp.startsWith(Common.SH_CODE_PREFIX)){
				stockCode = Common.SH_URL_PREFIX+temp;
			}else{
				stockCode = Common.SZ_URL_PREFIX+temp;
			}
			codeStr += stockCode+",";
			counter++;
			if(i ==stocks.size()-1){
				StockCode sc = new StockCode();
				sc.setCode(codeStr.substring(0,codeStr.length()-1));
				StockDataQueen.getInstance().getQueen().put(sc);
			}
			if(counter == count ){
				StockCode sc = new StockCode();
				sc.setCode(codeStr.substring(0,codeStr.length()-1));
				stockCode = "";
				codeStr = "";
				counter = 0;
				StockDataQueen.getInstance().getQueen().put(sc);
			}
		}
	}
	
	
}
