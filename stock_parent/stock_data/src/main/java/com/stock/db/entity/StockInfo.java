package com.stock.db.entity;

import java.util.Calendar;

import org.springframework.util.StringUtils;

import com.stock.DateUtils;


public class StockInfo {
	private String name;
	private String code;
	private String lowest;
	private String highest;
	private String open;
	private String closing;
	private String current;
	//昨收
	private String preClose;
	
	private String vol;
	
	private String closingCost;
	
	private int week;
	private String date;
	
	private String time;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(String closing) {
		this.closing = closing;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getPreClose() {
		return preClose;
	}
	public void setPreClose(String preClose) {
		this.preClose = preClose;
	}
	public String getVol() {
		return vol;
	}
	public void setVol(String vol) {
		this.vol = vol;
	}
	public String getClosingCost() {
		return closingCost;
	}
	public void setClosingCost(String closingCost) {
		this.closingCost = closingCost;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLowest() {
		return lowest;
	}
	public void setLowest(String lowest) {
		this.lowest = lowest;
	}
	public String getHighest() {
		return highest;
	}
	public void setHighest(String highest) {
		this.highest = highest;
	}
	
	public StockInfo(String info){
		infoHandler(info);
	}
	
/*	*
   	0：”大秦铁路”，股票名字；
	1：”27.55″，今日开盘价；
	2：”27.25″，昨日收盘价；
	3：”26.91″，当前价格；
	4：”27.55″，今日最高价；
	5：”26.20″，今日最低价；
	6：”26.91″，竞买价，即“买一”报价；
	7：”26.92″，竞卖价，即“卖一”报价；
	8：”22114263″，成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
	9：”589824680″，成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；
	10：”4695″，“买一”申请4695股，即47手；
	11：”26.91″，“买一”报价；
	12：”57590″，“买二”
	13：”26.90″，“买二”
	14：”14700″，“买三”
	15：”26.89″，“买三”
	16：”14300″，“买四”
	17：”26.88″，“买四”
	18：”15100″，“买五”
	19：”26.87″，“买五”
	20：”3100″，“卖一”申报3100股，即31手；
	21：”26.92″，“卖一”报价
	(22, 23), (24, 25), (26,27), (28, 29)分别为“卖二”至“卖四的情况”
	30：”2008-01-11″，日期；
	31：”15:05:32″，时间
	*/
	public void infoHandler(String info){
		if(!StringUtils.isEmpty(info)){
			String[] infos = info.split(",");
			this.name = infos[0];
			this.open = infos[1];
			this.preClose = infos[2];
			this.current = infos[3];
			this.highest = infos[4];
			this.lowest = infos[5];
			this.vol = infos[8];
			this.closingCost = infos[9];
			this.date = infos[30];
			this.time = infos[31];
			Calendar cal = Calendar.getInstance();
			cal.setTime(DateUtils.parseDate(date, "yyyy-MM-dd"));
			this.week = cal.get(Calendar.WEEK_OF_YEAR);
		}
	}

}
