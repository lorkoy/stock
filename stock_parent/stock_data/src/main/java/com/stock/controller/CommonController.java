package com.stock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.data.biz.DataService;
import com.stock.data.biz.StockService;
import com.stock.data.queen.work.StockDataQueen;
import com.stock.db.mybatis.StockInfoMapper;
import com.stock.dto.Message;
import com.stock.spring.ApplicationContextHodler;


@RestController
public class CommonController {
	
	@RequestMapping("common")
	public String common(HttpServletRequest request){
		String msg = request.getParameter("msg");
		if(StringUtils.isEmpty(msg)){
			return "index";
		}
		return "index";
	}

}
