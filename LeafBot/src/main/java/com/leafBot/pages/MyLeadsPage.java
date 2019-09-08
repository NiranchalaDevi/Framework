package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	
	
	public MyLeadsPage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(linkText="Create Lead")
	WebElement elecreateleads;
	



	
	public CreateLeadPage clickleadstab( ) {
		click(elecreateleads);
		return new CreateLeadPage();
	}


}
