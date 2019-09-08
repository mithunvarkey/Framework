package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement eleClickCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleClickCreateLead);
		return new CreateLeadPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement eleClickMergeLead;
	public MergeLeads clickMergeLead() {
		click(eleClickMergeLead);
		return new MergeLeads();
	}
	@FindBy(how=How.LINK_TEXT,using = "Find Leads") WebElement eleClickFindLeads;
	public FindLeadsPage clickFindLeads() {
		click(eleClickFindLeads);
		return new FindLeadsPage();
	}

}
