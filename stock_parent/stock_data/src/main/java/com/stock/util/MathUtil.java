/**
 * 
 */
package com.stock.util;

import java.math.BigDecimal;

/**
 * @author think
 *
 */
public class MathUtil {
	
	public static double round(double n,int bit){
		BigDecimal b = new BigDecimal(n);
		return b.setScale(bit, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
