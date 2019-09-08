package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using = "CRM/SFA") WebElement eleclick;
	public MyHomePage clickLink() {
		click(eleclick);
		return new MyHomePage();
	}

}










