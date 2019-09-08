package com.leafBot.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using = "username") WebElement eleUsername;
	public LoginPage enterUsername() {
		clearAndType(eleUsername,"DemoSalesManager");
		
		return this;
	}
	@FindBy(how=How.ID,using = "password") WebElement elePassword;
	public LoginPage enterPassword() {
		clearAndType(elePassword,"crmsfa");
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit") WebElement submit;
	public HomePage clickLogin() {
		click(submit);
		//HomePage page = new HomePage();
		return new HomePage();
	}

}










