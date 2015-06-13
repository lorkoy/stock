/**
 * 
 */
package com.stock.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author think
 *
 */
public class StringUtil {
	
	public static String replaceBlank(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
	
	public static void main(String[] args) {
		String str = "123\n\r";
		String result = StringUtil.replaceBlank(str);
		System.out.println(result);
	}

}
