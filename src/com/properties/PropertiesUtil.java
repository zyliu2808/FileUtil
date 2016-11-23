package com.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	public static String getProperties(String path,String key) throws Exception {
		Properties properties = new Properties();
		InputStream in = new FileInputStream(path);
		properties.load(in);
		return properties.getProperty(key);
	}
}
