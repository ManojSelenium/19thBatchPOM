package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.objrepo.LandingPagePeoperties;
import com.automation.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPagePeoperties{

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public SigninPage clickSignin() {
		System.out.println("Driver From Landing Page ::::: "+driver);
		
		click(By.xpath("//a[@class='login']"));
	
		return new SigninPage(driver);
	}
	
	public SigninPage clickContatUs() {
		System.out.println("Driver From Landing Page ::::: "+driver);
		
		click(By.xpath("//a[@class='login']"));
	
		return new SigninPage(driver);
	}
}
