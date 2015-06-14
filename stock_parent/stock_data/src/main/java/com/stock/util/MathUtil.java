/**
 * 
 */
package com.stock.util;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author think
 *
 */
public class MathUtil {
	
	/**
	 * 四舍五入
	 *@author ray
	 *@param value
	 *@param bit
	 *@return
	 * 
	 *2015年6月14日 下午3:21:05
	 */
	public static double round(double value,int bit){
		double temp = Math.pow(10, bit);
		return ((int)Math.round(temp * value))/temp;
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(MathUtil.round(5.145, 2));
		System.out.println(MathUtil.round(5.155, 2));
		System.out.println(MathUtil.round(5.566, 2));
	}

}
