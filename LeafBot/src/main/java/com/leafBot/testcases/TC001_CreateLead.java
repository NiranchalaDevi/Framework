package com.leafBot.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage1;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC001_CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void SetData(){

		excelFileName ="CreateLead";
		testcaseName= "TC001";
		testcaseDec="TC001";
		author= "Niran";
		category="smoke";

	}


	@Test(dataProvider ="fetchData")
	public void Tc001(String cname,String fname,String lname) {
		
		
	new LoginPage1()
			.enterUserName()
			.enterPassword()
			.clickLogin().clickcrmsfa()
			.clickleads()
			.clickleadstab()
			.entercname(cname)
			.enterfname(fname)
			.enterlname(lname)
			.clickCreateleadbutton();




	}




}

