package com.automation.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.dao.BeanFactory;
import com.automation.dao.CreateUserBean;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.LandingPage;
import com.automation.pages.SigninPage;
import com.automation.util.TestBase;

public class S76567_B2C_Create_Reuest extends TestBase{

	WebDriver driver;   // null value; set value
	LandingPage landingPage;
	@BeforeMethod
	public void setUp() {
		driver=intlizeDriver();
		System.out.println("Driver From Test Case :::: "+driver);
		 landingPage=enterURL(URL);
		//Browser Launch 
	}

	@Test
	public void testCase3(){
		SigninPage signinPage=landingPage.clickSignin();

		CreateUserBean bean=new CreateUserBean();  
		BeanFactory factory=new BeanFactory();
		factory.createNewUser(bean);
		
		signinPage.enterEmailAddress(bean);
		CreateAccountPage createAccountPage=signinPage.clickCreateAcAccount();
		createAccountPage.createNewUser(bean);
		
		Assert.assertEquals(createAccountPage.getText(), bean.getFirstName());
	}


	//@Test
	public void testCase4(){

	}

}
