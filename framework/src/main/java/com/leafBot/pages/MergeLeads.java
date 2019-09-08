package com.leafBot.pages;

import java.util.Set;

import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MergeLeads extends ProjectSpecificMethods{
	String parentWindow;
	public MergeLeads enterFromLeads(String lead) throws InterruptedException {
		parentWindow = driver.getWindowHandle();
		driver.findElementByXPath("//a[contains(@href,'partyIdFrom')]/img").click();
		Set<String> handles = driver.getWindowHandles();
		String toWindow;
		for(String windowHandles : handles) {
			if(!windowHandles.equals(parentWindow)) {

				driver.switchTo().window(windowHandles);
				toWindow = driver.getWindowHandle();
				driver.findElementByXPath("//label[text()='Lead ID:']/following::div/input").sendKeys(lead);
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(5000);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			}
		}
		driver.switchTo().window(parentWindow);
		return this;
	}

	public MergeLeads enterToLeads(String lead) throws InterruptedException {
		driver.findElementByXPath("//a[contains(@href,'partyIdTo')]/img").click();
		Set<String> handles1 = driver.getWindowHandles();
		for (String windowHandle : handles1) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				String newWindow = driver.getWindowHandle();
				driver.findElementByXPath("//label[text()='Lead ID:']/following::div/input").sendKeys(lead);
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(5000);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			}

		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		return this;

	}
	public ViewLead clickMerge() {
		driver.findElementByLinkText("Merge").click();
		ProjectSpecificMethods obj = new ProjectSpecificMethods();
		switchToAlert();
		acceptAlert();
		return new ViewLead();
	}
}
