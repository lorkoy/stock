/**
 * 
 */
package com.stock.data.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.stock.db.mybatis.StockMapper;

/**
 * @author think
 *
 */
@Service
@Transactional(isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
public class StockService {
	
	@Autowired
	private StockMapper stockMapper;
	
	
//	public void saveStock(){
//		List<Stock> list = new ArrayList<Stock>();
//		String[] stocks = Common.SZ_CODE.split(" ");
//		for(String str:stocks){
//			String code = str.substring(str.indexOf("(")+1,str.length()-1);
//			String name = str.substring(0,str.indexOf("("));
//			Stock s = new Stock();
//			s.setCode(code);
//			s.setName(name);
//			s.setCreateDate(new Date());
//			stockMapper.insertSelective(s);
//		}
//	}

}
