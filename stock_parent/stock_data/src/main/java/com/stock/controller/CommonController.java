package com.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.data.biz.DataService;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.dto.Message;


@RestController
public class CommonController {
	
	@Autowired
	DataService dataService;
	
	
	@RequestMapping("common")
	public Message common(){
		Message msg = new Message();
		try {
			StockDataQueen.getInstance().getQueen().put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return msg;
	}

}
