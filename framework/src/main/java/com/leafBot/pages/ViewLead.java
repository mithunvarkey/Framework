package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods{
	
	public ViewLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp") WebElement eleFirstName;
	public void verifyFirstName(String fName) {
		System.out.println("firstName in  verify"+fName);
		System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
		verifyExactText(eleFirstName,fName);
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads") WebElement eleFindLeadsClick;
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeadsClick);
		return new FindLeadsPage();
	}
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']") WebElement eleDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
	@FindBy(how=How.XPATH,using="//a[text()='Edit']") WebElement eleEditLead;
	public EditLeadPage clickEditLead() {
		click(eleEditLead);
		return new EditLeadPage();

	}
	public void verifyNewCompanyName(String oldCname) {
		String newName = driver.findElementById("viewLead_companyName_sp").getText().replaceAll("[^a-zA-Z]","").trim();
		if(newName.equalsIgnoreCase(oldCname)) {
			System.out.println("Validation success");
		}
		else {
			System.out.println("Validation not success");
		}


	}
	@FindBy(how=How.LINK_TEXT,using="Delete") WebElement eleDelete;
	public MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();
	}


}
