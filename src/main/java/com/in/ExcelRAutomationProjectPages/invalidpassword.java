package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invalidpassword {
WebDriver driver;
	@FindBy (xpath=("//p[text()='Your email or password is incorrect!']"))
	public WebElement invalidmsg;
	@FindBy (xpath=("//form[@method='POST']//p[text()='Email Address already exist!']"))
	public WebElement alreadyregistermsg;
	
	public invalidpassword(WebDriver driver){
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	
}
