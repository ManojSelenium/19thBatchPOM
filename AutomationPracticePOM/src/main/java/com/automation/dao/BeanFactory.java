package com.automation.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	
	public void createNewUser(CreateUserBean bean) {
		
		
		bean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		bean.setFirstName("Manoj");
		bean.setLastName("Manoj");
		bean.setPassword("Manoj@123");
		bean.setDateValue("5");
		bean.setMonthValue("5");
		bean.setYearValue("2016");
		bean.setStateValue("5");
	}
	
}
