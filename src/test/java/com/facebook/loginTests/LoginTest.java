package com.facebook.loginTests;

import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest {
	LoginPage loginPage;
	PropertiesReader propertiesReader;
	
	@Test
	public void loginTest() {
		propertiesReader= new PropertiesReader();
		loginPage= new LoginPage(driver);
		loginPage.userNameMethod(propertiesReader.getUserName());
		loginPage.passWordMethod(propertiesReader.getPassword());
		loginPage.logingButton();
		
		
		
	}
}
