package com.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {


	
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	int waitTime=100;
	
	public void click(By prop) {
		new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);
	}
	
	public String getText(By prop) {
		new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).getText();
	}
	
	public boolean isElementPresent(By prop) {
		new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).isDisplayed();
	}
	
	
	public void selectValuerFromDropDown(By prop,String value) {
		//new WebDriverWait(driver, waitTime).until(ExpectedConditions.presenceOfNestedElementLocatedBy(locator, childLocator)(prop));
		new Select(driver.findElement(prop)).selectByValue(value);
	}
	
	public void selectValuerFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
}
