package com.w2a.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;
import org.openqa.selenium.By;

public class BuymeterTest extends TestBase {
	
     @Test
     public void BuyMeter () throws InterruptedException {
	
    	  click("BuyMeterBtn_XPATH");
    	  Thread.sleep(2000);
    	  click("NoMeterAccBtn_XPATH");
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath(OR.getProperty("Firstname_XPATH")));
    	  driver.findElement(By.xpath(OR.getProperty("Firstname_XPATH"))).sendKeys(OR.getProperty("firstname_TEXT"));
    	  driver.findElement(By.xpath(OR.getProperty("Lastname_XPATH")));
    	  driver.findElement(By.xpath(OR.getProperty("Lastname_XPATH"))).sendKeys(OR.getProperty("lastname_TEXT"));
    	  driver.findElement(By.id(OR.getProperty("RegEmail_ID"))).clear();
  		  driver.findElement(By.id(OR.getProperty("RegEmail_ID"))).sendKeys(OR.getProperty("RegEmail_TEXT"));
  		  driver.findElement(By.id(OR.getProperty("PhoneNumber_ID")));
		  driver.findElement(By.id(OR.getProperty("PhoneNumber_ID"))).sendKeys(OR.getProperty("PhoneNumber_TEXT"));
		  driver.findElement(By.name(OR.getProperty("NewPassword_NAME"))).clear();
		  driver.findElement(By.name(OR.getProperty("NewPassword_NAME"))).sendKeys(OR.getProperty("NewPassword_TEXT"));
		  click("TermsBtn_XPATH");
		  click("continueBtn_XPATH");
    	  
    	  
      }
}
