package com.Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	public Properties properties() throws IOException {
		
		InputStream input = new FileInputStream("./src/main/resources/config/Config.properties");	
		Properties pro = new Properties();
		pro.load(input);
		
		return pro;
		
	}

}
