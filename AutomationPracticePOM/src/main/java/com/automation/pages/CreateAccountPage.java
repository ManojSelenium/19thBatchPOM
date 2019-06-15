package com.automation.pages;

import org.openqa.selenium.WebDriver;

import com.automation.dao.CreateUserBean;
import com.automation.objrepo.CreateAccountPageProperties;
import com.automation.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterFirstName(CreateUserBean bean) {
		enterText(FIRSTNAME_LOCATOR, bean.getFirstName());
	}

	public void enterLastName(CreateUserBean bean) {
		enterText(LASTNAME_LOCATOR, bean.getLastName());
	}

	public void enterPassword(CreateUserBean bean) {
		enterText(PASSWORD_LOCATOR, bean.getPassword());
	}

	public void enterCity() {

	}
	public void selectState(CreateUserBean bean) {
		selectValuerFromDropDown(STATE_LOCATOR, bean.getStateValue());
	}

	public void selectDate(CreateUserBean bean) {
		selectValuerFromDropDown(DAYS_LOCATOR, bean.getDateValue());
	}
	public void selectMonth(CreateUserBean bean) {
		selectValuerFromDropDown(MONTH_LOCATOR, bean.getMonthValue());
	}
	public void selectYear(CreateUserBean bean) {
		selectValuerFromDropDown(YEAR_LOCATOR, bean.getYearValue());
	}
	public void enterPhoneNumber() {

	}

	public String getText() {
		return getText(FIRSTNAME_LOCATOR);
	}
	public void createNewUser(CreateUserBean bean) {
		enterFirstName(bean);
		enterLastName(bean);
		
		//enterPassword(bean);
		
		selectDate(bean);
		selectMonth(bean);
		selectYear(bean);
		selectState(bean);
	}
}
