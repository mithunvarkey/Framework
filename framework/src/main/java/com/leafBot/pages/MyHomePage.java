package com.leafBot.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Leads") WebElement eleLink;
	public MyLeadsPage clickLeads() {
		click(eleLink);
		return new MyLeadsPage();
	}

}
