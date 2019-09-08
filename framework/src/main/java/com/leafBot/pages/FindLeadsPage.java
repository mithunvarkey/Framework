package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	public FindLeadsPage enterLeadId(String lead)
	{
		driver.findElementByXPath("//label[text()='Lead ID:']/following::div/input").sendKeys(lead);
		return this;
	}
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	public void verifyLeads() {
		if(driver.findElementByXPath("//div[@class='x-paging-info']").getText().equals("No records to display")) {
			System.out.println("Validation success");
		}
		else System.out.println("Validation failed");

	}
	public FindLeadsPage clickEmail() {
		driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}
	public FindLeadsPage enterEmail(String email) {
		driver.findElementByXPath("(//label[text()='Email Address:']/following::input)[1]").sendKeys(email);
		return this;
	}
	public ViewLead clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		return new ViewLead();
	}
	public String getLeadIdofFirstResulting() throws InterruptedException {
		Thread.sleep(5000);
		
		String firstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").getText();
		System.out.println(firstName);
		return firstName;
	}
	public FindLeadsPage enterFirstName(String fName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//label[text()='Lead ID:']/following::div[4]/input").sendKeys(fName);
		return this;
	}
	public FindLeadsPage clickPhone() {
		driver.findElementByLinkText("Phone").click();
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String cc,String sc,String ph) {
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByName("phoneCountryCode").sendKeys(cc);
		driver.findElementByName("phoneAreaCode").sendKeys(sc);
		driver.findElementByName("phoneNumber").sendKeys(ph);
		return this;
	}
	public String getLeadId() {
		String id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		return id;
	}
	
}
