package com.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.pages.LandingPage;

public class TestBase implements Setup{

	WebDriver driver;
	String a;
	
	public WebDriver intlizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		 driver=new ChromeDriver();
		 
		 System.out.println("Driver From testbase ::::: "+driver);
		 return driver;
	}
	
	public LandingPage enterURL(String url) {
		driver.get(url);
		return new LandingPage(driver);
	}
}
