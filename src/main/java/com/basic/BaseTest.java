package com.basic;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Utilites.ReadProperties;

public class BaseTest {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void start() throws IOException {
		
		Properties prop = new ReadProperties().properties();
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Dev\\ChromDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser name is Chrome");
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("", "");
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("No Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.capitalone.com");
		
	
	}
	
	

}
