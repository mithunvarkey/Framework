package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::div/input") WebElement eleLeadId;
	public FindLeadsPage enterLeadId(String lead)
	{
		clearAndType(eleLeadId,lead);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']") WebElement eleClickFindLeads;
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		click(eleClickFindLeads);
		Thread.sleep(3000);
		return this;
	}
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']") WebElement eleFindLeadText;
	public void verifyLeads() {
		verifyExactText(eleFindLeadText,"No records found");
	}
	@FindBy(how=How.XPATH,using="//span[text()='Email']") WebElement eleEmail;
	public FindLeadsPage clickEmail() {
		click(eleEmail);
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
