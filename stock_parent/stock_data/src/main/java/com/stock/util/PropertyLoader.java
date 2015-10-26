package com.stock.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.PathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertyLoader {
	
	private static String path = "/common.properties";
	
	private static Properties props;
	
	
	static{
		try {
			props =  PropertiesLoaderUtils.loadProperties(new PathResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key){
		return props.getProperty(key);
	}
	
	
	
	public static void main(String[] args) {
		props = System.getProperties();
		System.out.println(PropertyLoader.get("mail.smtp.host"));
	}

}
