/**
 * 
 */
package com.stock.dto;

/**
 * @author think
 *
 */
public class Macd {
	private double ema1;
	private double ema2;
	private double diff;
	private double dea;
	private double bar;
	
	public Macd(double ema1,double ema2,double diff,double dea,double bar){
		this.ema1 = ema1;
		this.ema2 = ema2;
		this.bar = bar;
		this.diff = diff;
		this.dea = dea;
	}
	
	public double getEma1() {
		return ema1;
	}
	public void setEma1(double ema1) {
		this.ema1 = ema1;
	}
	public double getEma2() {
		return ema2;
	}
	public void setEma2(double ema2) {
		this.ema2 = ema2;
	}
	public double getDiff() {
		return diff;
	}
	public void setDiff(double diff) {
		this.diff = diff;
	}
	public double getDea() {
		return dea;
	}
	public void setDea(double dea) {
		this.dea = dea;
	}
	public double getBar() {
		return bar;
	}
	public void setBar(double bar) {
		this.bar = bar;
	}
	
}
