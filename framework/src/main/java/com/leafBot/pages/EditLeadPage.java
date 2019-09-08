package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	public EditLeadPage clearCompanyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		return this;
	}
	public EditLeadPage enterNewCompanyName(String newCompName) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(newCompName);
		return this;
	}
	public ViewLead clickUpdate() {
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
		return new ViewLead();
	}
	

}
