/**
 * 
 */
package com.stock.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author think
 *
 */
public class HttpUtils {
	
	/**
	 * 发送http请求
	 *@author ray
	 *@param _url 请求地址
	 *@param param 请求参数
	 *@return
	 * 
	 *2015年8月21日 上午11:51:11
	 */
	public static String sendHttpRequest(String _url,String charset) throws Exception{
		InputStream is = null;
		byte[] b = new byte[1024];
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		URL url = new URL(_url);
		is = url.openStream();
		int i = -1;
		while((i = is.read(b)) != -1){
			out.write(b,0,i);
		}
		return out.toString(charset);
	}

}
