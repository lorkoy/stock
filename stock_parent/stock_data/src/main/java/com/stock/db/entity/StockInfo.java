package com.stock.db.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.stock.data.biz.DataService;
import com.stock.util.DateUtils;

public class StockInfo {
	private static final Logger logger = LoggerFactory.getLogger(StockInfo.class);
	
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
    
//    public StockInfo(String info){
//    	infoHandler(info);
//	}
	

}