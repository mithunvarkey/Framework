package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement eleCompName;
	public CreateLeadPage enterCompanyName(String cName) {
		clearAndType(eleCompName,cName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName") WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String firstName) {
		clearAndType(eleFirstName,firstName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName") WebElement eleLastName;
	public CreateLeadPage enterSecondName(String lastName) {
		clearAndType(eleLastName,lastName);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit") WebElement eleClick;
	public ViewLead clickCreateLead() {
		click(eleClick);
		return new ViewLead();
	}

}
