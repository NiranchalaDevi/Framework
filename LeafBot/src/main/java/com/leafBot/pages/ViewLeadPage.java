package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage VerifyCreatelead() {
	

	
	String j = driver.findElementByXPath("//div [@class='x-panel-header sectionHeaderTitle']").getText();
	System.out.println("Your page title Is : "+j);
	String i = "Duplicate Lead";
	if(i.equals(j))
		System.out.println("pass");
	else
		System.out.println("fail");
	return this;

}
}

