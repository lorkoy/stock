package com.stock.db.entity;

import java.util.Date;

public class Bankroll {
    private Integer id;

    private String stockCode;

    private String year;

    private String month;

    private String date;

    private String mainforceIn;

    private String mainforceOut;

    private String largeIn;

    private String largeOut;

    private String bigIn;

    private String bigOut;

    private String mediumIn;

    private String mediumOut;

    private String smallIn;

    private String smallOut;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getMainforceIn() {
        return mainforceIn;
    }

    public void setMainforceIn(String mainforceIn) {
        this.mainforceIn = mainforceIn == null ? null : mainforceIn.trim();
    }

    public String getMainforceOut() {
        return mainforceOut;
    }

    public void setMainforceOut(String mainforceOut) {
        this.mainforceOut = mainforceOut == null ? null : mainforceOut.trim();
    }

    public String getLargeIn() {
        return largeIn;
    }

    public void setLargeIn(String largeIn) {
        this.largeIn = largeIn == null ? null : largeIn.trim();
    }

    public String getLargeOut() {
        return largeOut;
    }

    public void setLargeOut(String largeOut) {
        this.largeOut = largeOut == null ? null : largeOut.trim();
    }

    public String getBigIn() {
        return bigIn;
    }

    public void setBigIn(String bigIn) {
        this.bigIn = bigIn == null ? null : bigIn.trim();
    }

    public String getBigOut() {
        return bigOut;
    }

    public void setBigOut(String bigOut) {
        this.bigOut = bigOut == null ? null : bigOut.trim();
    }

    public String getMediumIn() {
        return mediumIn;
    }

    public void setMediumIn(String mediumIn) {
        this.mediumIn = mediumIn == null ? null : mediumIn.trim();
    }

    public String getMediumOut() {
        return mediumOut;
    }

    public void setMediumOut(String mediumOut) {
        this.mediumOut = mediumOut == null ? null : mediumOut.trim();
    }

    public String getSmallIn() {
        return smallIn;
    }

    public void setSmallIn(String smallIn) {
        this.smallIn = smallIn == null ? null : smallIn.trim();
    }

    public String getSmallOut() {
        return smallOut;
    }

    public void setSmallOut(String smallOut) {
        this.smallOut = smallOut == null ? null : smallOut.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}