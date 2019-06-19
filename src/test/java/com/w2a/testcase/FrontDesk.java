package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class FrontDesk extends TestBase {
	
	@Test
	public void InvalidLogin () throws InterruptedException {
		
		driver.findElement(By.name(OR.getProperty("adminEmail_NAME"))).sendKeys(OR.getProperty("invalidAdminEmailText"));
		driver.findElement(By.name(OR.getProperty("adminPass_NAME"))).sendKeys(OR.getProperty("adminPassText"));		
		click("loginBtn_XPATH");
		Thread.sleep(2000);
		log.debug("Log in successfully executed");
		
	}
	
	@Test
	public void validkLogin () throws InterruptedException {
		driver.findElement(By.name(OR.getProperty("adminEmail_NAME"))).clear();
		driver.findElement(By.name(OR.getProperty("adminEmail_NAME"))).sendKeys(OR.getProperty("adminEmailText"));
		driver.findElement(By.name(OR.getProperty("adminPass_NAME"))).clear();
		driver.findElement(By.name(OR.getProperty("adminPass_NAME"))).sendKeys(OR.getProperty("adminPassText"));		
		click("loginBtn_XPATH");
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("selectHospital_XPATH"))), "Unable to validate Homepage");
		click("selectHospital_XPATH");
		Thread.sleep(3000);
		click("EFHIkeja_XPATH");
		click("saveBtn_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("loginBtn_XPATH"))), "Unable to validate Homepage");
		log.debug("Log in successfully executed");
		
	}

}
