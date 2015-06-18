package com.stock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stock.common.Common;
import com.stock.data.biz.DataService;
import com.stock.db.entity.StockInfo;


@Controller
public class CommonController {
	
	@Autowired
	private DataService dataService;
	
	@RequestMapping("common")
	public String common(HttpServletRequest request){
		String msg = request.getParameter("msg");
//		dataService.service();
		if(StringUtils.isEmpty(msg)){
			return "/index";
		}
		return "/index";
	}
	
	@RequestMapping("index.do")
	@ResponseBody
	public Map<String,Object> queryStockInfo(){
		Map<String,Object> result = new HashMap<String, Object>();
		List<StockInfo> stockInfos = dataService.queryStockInfo();
		result.put("list", stockInfos);
		result.put("ok", Common.SUCCESS);
		return result;
	}
	
	@RequestMapping("table")
	public String table(HttpServletRequest request){
		String msg = request.getParameter("msg");
//		dataService.service();
		if(StringUtils.isEmpty(msg)){
			return "/table";
		}
		return "/table";
	}

}
