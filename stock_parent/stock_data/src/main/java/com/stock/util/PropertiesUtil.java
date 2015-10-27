/**
 * 
 */
package com.stock.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

/**
 * @author think
 *
 */
public class PropertiesUtil {
	private Properties pro = new Properties();
	
	private PropertiesUtil(){
		load("/common.properties");
	}
	
	private static class SingletonHolder{
		private static PropertiesUtil instance = new PropertiesUtil();
	}
	
	public static PropertiesUtil getInstance(){
		return SingletonHolder.instance;
	}
	
	public String get(String key){
		Object obj = pro.get(key);
		return obj == null?null:obj.toString();
	}
	
	
	private void load(String path){
		try {
			ResourceLoader loader = new DefaultResourceLoader();
			InputStream is = loader.getResource(path).getInputStream();
			pro.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String url = PropertiesUtil.getInstance().get("stock_info_url");
		System.out.println(url);
	}

}
