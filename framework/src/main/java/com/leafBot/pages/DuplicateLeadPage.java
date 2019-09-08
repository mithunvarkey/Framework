package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit") WebElement eleClickCreateLead;
	public ViewLead clickCreateLead()
	{
		click(eleClickCreateLead);
		return new ViewLead();
	}

}
