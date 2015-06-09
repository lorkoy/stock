package com.stock.db.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.util.StringUtils;

import com.stock.util.DateUtils;

public class StockInfo {
    private String id;

    private String closing;

    private String open;

    private String name;

    private String code;

    private String lowest;

    private String highest;

    private String current;

    private String preclose;

    private String vol;

    private String closingcost;

    private Date date;

    private String time;

    private Integer week;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClosing() {
        return closing;
    }

    public void setClosing(String closing) {
        this.closing = closing == null ? null : closing.trim();
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open == null ? null : open.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getLowest() {
        return lowest;
    }

    public void setLowest(String lowest) {
        this.lowest = lowest == null ? null : lowest.trim();
    }

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest == null ? null : highest.trim();
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current == null ? null : current.trim();
    }

    public String getPreclose() {
        return preclose;
    }

    public void setPreclose(String preclose) {
        this.preclose = preclose == null ? null : preclose.trim();
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol == null ? null : vol.trim();
    }

    public String getClosingcost() {
        return closingcost;
    }

    public void setClosingcost(String closingcost) {
        this.closingcost = closingcost == null ? null : closingcost.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
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
			this.id = UUID.randomUUID().toString();
			this.name = infos[0];
			this.open = infos[1];
			this.preclose = infos[2];
			this.current = infos[3];
			this.highest = infos[4];
			this.lowest = infos[5];
			this.vol = infos[8];
			this.closingcost = infos[9];
			this.date = DateUtils.parseDate(infos[30], "yyyy-MM-dd");
			this.time = infos[31];
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			this.week = cal.get(Calendar.WEEK_OF_YEAR);
		}
	}
}