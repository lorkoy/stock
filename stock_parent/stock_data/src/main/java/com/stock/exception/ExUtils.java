package com.stock.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExUtils {
	
	public static String printExAsString(Throwable e){
		StringWriter info = new StringWriter();
		e.printStackTrace(new PrintWriter(info));
		return info.toString();
	}

}
