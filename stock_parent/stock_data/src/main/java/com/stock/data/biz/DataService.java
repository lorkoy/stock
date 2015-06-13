package com.stock.data.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.stock.data.Common;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.dto.StockCode;


@Component("dataService")
public class DataService {
	private static final Logger logger = LoggerFactory.getLogger(DataService.class);
	private static final int count = 10;
	
	public void service(){
		try {
			parseStockCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Map<String,List<String>> parseStockCode() throws Exception{
		int counter = 0;
		Map<String,List<String>> allCodes = new HashMap<String, List<String>>();
		List<String> shCodes = new ArrayList<String>();
		List<String> szCodes = new ArrayList<String>();
		String[] codes = Common.SH_CODE.split(" ");
		
		String codeStr = "";
		for(int i = 0;i<codes.length;i++){
			String code = codes[i];
			String temp = code.substring(code.indexOf("(")+1, code.length()-1);
			String stockCode = "";
			if(temp.startsWith(Common.SH_CODE_PREFIX)){
				stockCode = Common.SH_URL_PREFIX+temp;
				shCodes.add(stockCode);
			}else{
				stockCode = Common.SH_URL_PREFIX+temp;
				szCodes.add(stockCode);
			}
			codeStr += stockCode+",";
			counter++;
			if(i ==codes.length-1){
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
		allCodes.put("sz", szCodes);
		allCodes.put("sh", shCodes);
		return allCodes;
	}
	
	
}
