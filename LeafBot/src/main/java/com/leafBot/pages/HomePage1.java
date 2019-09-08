package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage1 extends ProjectSpecificMethods {
	
	public HomePage1(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(linkText="CRM/SFA")
	WebElement elecrmsfa;
	



	
	public MyHomePage clickcrmsfa( ) {
		click(elecrmsfa);
		return new MyHomePage();
	}

	
}
