package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.dao.CreateUserBean;
import com.automation.objrepo.SigninPageProeprties;
import com.automation.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProeprties{

	WebDriver driver;
	
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddress(CreateUserBean bean) {
		enterText(EMAILADDRESS_LOCATOR, bean.getEmailAddress());
	}
	
	public CreateAccountPage clickCreateAcAccount() {
		click(CREATEACCOUNTBUTTON_LOCATOR);
		return new CreateAccountPage(driver);
	}
}
