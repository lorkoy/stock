/**
 * 
 */
package com.stock.util;

import com.stock.dto.Macd;

/**
 * @author think
 *
 */
public class Indicator {
	
	/**
	 * 计算新股上市第二日macd，第一日为0
	 *@author ray
	 *@param closing 第二天的收盘价
	 *@param firstClosing 上市收盘价
	 *@param fast macd参数（快）
	 *@param slow macd参数（慢）
	 *@param preDea 前日dea
	 *@return
	 * 
	 *2015年6月14日 上午1:35:50
	 */
	public static Macd macd(double closing,double firstClosing,int fast,int slow){
		double ema1 = MathUtil.round(firstClosing - (closing - firstClosing) * 2/(fast+1), 4);
		double ema2 = MathUtil.round(firstClosing - (closing - firstClosing) * 2/(slow+1), 4);
		double diff = ema1 - ema2;
		double dea = diff * 0.2;
		double bar = 2*(diff-dea);
		Macd macd = new Macd();
		macd.setBar(MathUtil.round(bar,2));
		macd.setDea(MathUtil.round(dea,2));
		macd.setDiff(MathUtil.round(diff,2));
		macd.setEma1(MathUtil.round(ema1,2));
		macd.setEma2(MathUtil.round(ema2,2));
		return macd;
	}
	
	/**
	 * 计算MACD
	 *@author ray
	 *@param preEma1
	 *@param preEma2
	 *@param preDea
	 *@param closing
	 *@return
	 * 
	 *2015年6月14日 上午1:38:45
	 */
	public static Macd macd(double preEma1,double preEma2,double preDea,double closing){
		double ema1 = preEma1* 11/13 + closing*2/13;
		double ema2 =  preEma2* 25/27 + closing*2/27;
		double diff = ema1 - ema2;
		double dea = preDea * 0.8 +diff * 0.2;
		double bar = 2*(diff-dea);
		Macd macd = new Macd();
		macd.setBar(MathUtil.round(bar,2));
		macd.setDea(MathUtil.round(dea,2));
		macd.setDiff(MathUtil.round(diff,2));
		macd.setEma1(MathUtil.round(ema1,2));
		macd.setEma2(MathUtil.round(ema2,2));
		return macd;
	}
	
	
	public static void main(String[] args) {
		Macd macd = Indicator.macd(11.07, 11.1, 12, 26);
		System.out.println(macd.getDiff());
		System.out.println(macd.getDea());
		System.out.println(macd.getEma1());
		System.out.println(macd.getEma2());
		System.out.println(macd.getBar());
		System.out.println("second #############################");
		 macd = Indicator.macd(macd.getEma1(), macd.getEma2(), macd.getDea(), 11.07);
		 System.out.println(macd.getDiff());
			System.out.println(macd.getDea());
			System.out.println(macd.getEma1());
			System.out.println(macd.getEma2());
			System.out.println(macd.getBar());
			System.out.println("third #############################");
		 macd = Indicator.macd(macd.getEma1(), macd.getEma2(), macd.getDea(), 10.65);
		 System.out.println(macd.getDiff());
			System.out.println(macd.getDea());
			System.out.println(macd.getEma1());
			System.out.println(macd.getEma2());
			System.out.println(macd.getBar());
			System.out.println("forth #############################");
		 macd = Indicator.macd(macd.getEma1(), macd.getEma2(), macd.getDea(), 10.77);
		System.out.println(macd.getDiff());
		System.out.println(macd.getDea());
		System.out.println(macd.getEma1());
		System.out.println(macd.getEma2());
		System.out.println(macd.getBar());
	}

}
