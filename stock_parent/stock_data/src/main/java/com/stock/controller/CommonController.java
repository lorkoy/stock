package com.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.dto.Message;


@RestController
public class CommonController {
	
	@RequestMapping("common")
	public Message common(){
		Message msg = new Message();
		return msg;
	}

}
