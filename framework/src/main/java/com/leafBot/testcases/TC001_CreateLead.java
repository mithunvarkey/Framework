package com.leafBot.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="CreateLead";
		testcaseName="TC001_CreateLead";
		testcaseDec = "Test";
		author = "Mithun";
		category = "Smoke";
	}
	
	//@Parameters({"username","password"})
	
	@Test(dataProvider="fetchData")
	public void runTC001(String cName,String fName,String lName) {
		/*LoginPage page = new LoginPage();
		page.enterUsername("");
		page.enterPassword("");
		page.clickLogin();*/
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterSecondName(lName)
		.clickCreateLead()
		.verifyFirstName(fName);
		
		
	}

}







