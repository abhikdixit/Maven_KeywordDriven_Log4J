package com.test;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.keyword.BasePage;
import com.keyword.ReadObject;


public class LoginTest {
	
	WebDriver dr = new ChromeDriver();
	ReadObject object = new ReadObject();
	BasePage operation = new BasePage(dr);
	@Test
	public void TC_001() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "url");
		operation.perform(allObjects,"SETTEXT", "username", "name", "admin");
		operation.perform(allObjects,"SETTEXT", "password", "name", "admin123");
		operation.perform(allObjects,"CLICK", "loginButton", "name", "");
		//Assert.assertEquals(actual, expected);
	}
}
