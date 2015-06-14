/**
 * 
 */
package com.stock.util;

import com.stock.data.Common;
import com.stock.dto.Macd;

/**
 * @author think
 *
 */
public class Indicator {
	
	
	/**
	 * 计算ema
	 *@author ray
	 *@param closing
	 *@param num 快慢周期
	 *@param preEma 第一日的ema 为收盘价
	 *@return
	 * 
	 *2015年6月14日 下午2:20:13
	 */
	public static double getEma(double closing,int num,double preEma){
		double k = MathUtil.round(2.0/(num+1.0), 5);
		double ema = closing * k + preEma * (1 - k);
		return MathUtil.round(ema, 5);
	}
	
	public Macd macd(double closing,double preEma){
		double ema1 = getEma(closing, Common.MACD_FAST, preEma);
		double ema2 = getEma(closing, Common.MACD_SLOW, preEma);
		double diff = ema1 - ema2;
		double dea = diff * 0.2;
		double bar = 1.6 * diff;
		Macd m = new Macd(ema1, ema2, diff, dea, bar);
		return m;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("2 #############################");
		
		double ema1 = Indicator.getEma(7.75, 12, 8.3);
		double ema2 = Indicator.getEma(7.75, 26, 8.3);
		double dif = ema1 - ema2;
		double dea = dif * 0.2;
		double bar = 1.6 * dif;
		System.out.println("ema1 is " + MathUtil.round(ema1, 4));
		System.out.println("ema2 is " + MathUtil.round(ema2, 4));
		System.out.println("diff is "+ MathUtil.round(dif, 4));
		System.out.println("dea is " + MathUtil.round(dea, 4));
		System.out.println("bar is " + MathUtil.round(bar, 4));
		
		
		System.out.println("3 #############################");
		ema1 = Indicator.getEma(7.84, 12, 8.2154);
		ema2 = Indicator.getEma(7.84, 26, 8.2593);
		dif = ema1 - ema2;
		dea = dif * 0.2;
		bar = 2 * (dif - dea);
		System.out.println("ema1 is " + MathUtil.round(ema1, 5));
		System.out.println("ema2 is " + MathUtil.round(ema2, 5));
		System.out.println("diff is "+ MathUtil.round(dif, 2));
		System.out.println("dea is " + MathUtil.round(dea, 2));
		System.out.println("bar is " + MathUtil.round(bar, 2));
		
		
		System.out.println("4 #############################");
		ema1 = Indicator.getEma(10.65, 12, 11.1);
		ema2 = Indicator.getEma(10.65, 26, 11.1);
		dif = ema1 - ema2;
		dea = dif * 0.2;
		bar = 2 * (dif - dea);
		System.out.println("ema1 is " + MathUtil.round(ema1, 2));
		System.out.println("ema2 is " + MathUtil.round(ema2, 2));
		System.out.println("diff is "+ MathUtil.round(ema1 - ema2, 2));
		System.out.println("dea is " + MathUtil.round(dea, 2));
		System.out.println("bar is " + MathUtil.round(bar, 2));
		
		
		System.out.println("5 #############################");
		ema1 = Indicator.getEma(10.77, 12, 11.03);
		ema2 = Indicator.getEma(10.77, 26, 11.07);
		dif = ema1 - ema2;
		dea = dif * 0.2;
		bar = 2 * (dif - dea);
		System.out.println("ema1 is " + MathUtil.round(ema1, 2));
		System.out.println("ema2 is " + MathUtil.round(ema2, 2));
		System.out.println("diff is "+ MathUtil.round(ema1 - ema2, 2));
		System.out.println("dea is " + MathUtil.round(dea, 2));
		System.out.println("bar is " + MathUtil.round(bar, 2));
	}

}
