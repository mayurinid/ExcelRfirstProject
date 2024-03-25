package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testcaseverifyPage {
	
	WebDriver driver;
	@FindBy (xpath=("(//ul[@class='nav navbar-nav']//a)[5]"))
	public WebElement testcaseclik;
	@FindBy (xpath=("(//h2[@class='title text-center']//b)"))
	public WebElement testcasevrification;
	
	public testcaseverifyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void testcaseclick() {
		testcaseclik.click();
	}
	public String testcaseveri() {
		String testcasesucess=testcasevrification.getText();
		return testcasesucess;
	}

}
