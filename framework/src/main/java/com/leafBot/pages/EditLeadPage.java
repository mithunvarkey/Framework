package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using ="updateLeadForm_companyName") WebElement eleCompName;
	public EditLeadPage clearCompanyName() {
		clear(eleCompName);
		return this;
	}
	
	public EditLeadPage enterNewCompanyName(String newCompName) {
		clearAndType(eleCompName,newCompName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit'][1]") WebElement eleClickUpdatee;
	public ViewLead clickUpdate() {
		click(eleClickUpdatee);
		return new ViewLead();
	}
	

}
