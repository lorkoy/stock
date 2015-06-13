package com.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.data.biz.DataService;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.db.mybatis.StockInfoMapper;
import com.stock.dto.Message;
import com.stock.spring.ApplicationContextHodler;


@RestController
public class CommonController {
	
	@Autowired
	private DataService dataService;
	
	@Autowired
	private StockInfoMapper stockInfoMapper;
	
	@RequestMapping("common")
	public Message common(){
		try {
			dataService.parseStockCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Message msg = new Message();
		return msg;
	}

}
