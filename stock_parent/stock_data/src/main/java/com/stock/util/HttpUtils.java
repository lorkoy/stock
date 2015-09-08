/**
 * 
 */
package com.stock.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

import org.apache.catalina.tribes.util.Arrays;

/**
 * @author think
 *
 */
public class HttpUtils {
	
	/**
	 * 发送http请求
	 *@author ray
	 *@param _url 请求地上
	 *@param param 请求参数
	 *@return
	 * 
	 *2015年8月21日 上午11:51:11
	 */
	public static String sendHttpRequest(String _url,String charset) throws Exception{
		InputStream is = null;
		byte[] b = new byte[1024];
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			URL url = new URL(_url);
			is = url.openStream();
			int i = -1;
			while((i = is.read(b)) != -1){
				out.write(b,0,i);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return out.toString(charset);
	}
	
	
	public static void main(String[] args) {
		
	}

}
