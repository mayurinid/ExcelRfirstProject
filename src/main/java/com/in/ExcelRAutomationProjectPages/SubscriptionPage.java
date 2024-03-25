package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {
	
	WebDriver driver;
	@FindBy (xpath=("//input[@id='susbscribe_email']"))
	public WebElement Subscritiontext;
	
	@FindBy (xpath=("//button[@id='subscribe']"))
	public WebElement subscriptionbtn;
	
	@FindBy (xpath=("//div[text()='You have been successfully subscribed!']"))
	public WebElement subscriptionsucessfully;
	@FindBy (xpath=("(//ul[@class='nav navbar-nav']//li)[3]"))
	public WebElement cartclick;
	@FindBy (xpath=("//i[@class='fa fa-angle-up']"))
	public WebElement arrowbtn;
	@FindBy (xpath=("//h2[text()='Full-Fledged practice website for Automation Engineers']"))
	public WebElement verificationarr;
	public SubscriptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void subscrtiontextdisplay() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Subscritiontext.sendKeys("rnmayuri08@gmail.com");
	}
	public void subscrtionbtndisplay() {
		subscriptionbtn.click();
}
	public String subscriptionsucessfully() {
		String ss=subscriptionsucessfully.getText();
		return ss;
	}
	
	public void cartclickbt() {
		cartclick.click();
}
	public void subscriptionarrowbtn() {
		arrowbtn.click();
}
	public String verificationarr() {
		String ss=verificationarr.getText();
		return ss;
	}
	
}
