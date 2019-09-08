package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(){
	//This is Constructor: starting point for java
	PageFactory.initElements(driver, this);		}
	
	@CacheLookup
	@FindBy(xpath="//a[@href='/crmsfa/control/leadsMain']")
	WebElement eleleads;
	



	
	





	public MyLeadsPage clickleads() {
		click(eleleads);
		return new MyLeadsPage();
	}

}
