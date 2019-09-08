package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage1 extends ProjectSpecificMethods {
	
	
	public LoginPage1(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(id="username")
	WebElement eleUserName;
	
	@CacheLookup
	@FindBy(id="password")
	WebElement elePassword;
	
	@FindBy(className="decorativeSubmit")
	WebElement eleLogin;
	
	public LoginPage1 enterUserName() {
		clearAndType(eleUserName, "DemoSalesManager");
		return this;	
	}
	
	public LoginPage1 enterPassword() {
		clearAndType(elePassword, "crmsfa");
		return this;	
	}

	public HomePage1 clickLogin() {
	click(eleLogin);
	return new HomePage1();
	
}

}


