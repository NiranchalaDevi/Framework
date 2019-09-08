package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	
	public CreateLeadPage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(id="createLeadForm_firstName")
	WebElement elefirstname;
	
	@CacheLookup
	@FindBy(id="createLeadForm_lastName")
	WebElement elelastname;
	@CacheLookup
	@FindBy(id="createLeadForm_companyName")
	WebElement elecompanyname;
	@CacheLookup
	@FindBy(name="submitButton")
	WebElement elesubmitbutton;

	

	
	public CreateLeadPage entercname(String cname) {
		clearAndType(elecompanyname,cname);

		return this;
	}	
	
	public CreateLeadPage enterfname(String fname) {
	
		clearAndType(elefirstname,fname);

		return this;
	}	
	

	public CreateLeadPage enterlname(String lname) {
	
		clearAndType(elelastname,lname);
		return this;
	}	
	


	public ViewLeadPage clickCreateleadbutton() {
	click(elesubmitbutton);
		return new ViewLeadPage();
	}	

}
