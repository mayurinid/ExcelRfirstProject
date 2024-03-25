package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutuserPage {
	WebDriver driver;
	 


@FindBy (xpath="//input[@name='name']") 
public WebElement name;
	  @FindBy (xpath="//ul[@class='nav navbar-nav']//child::a[contains(text(),'Logout')]")
	   public WebElement logoutbtn;
	  @FindBy(xpath = "(//ul[@class='nav navbar-nav']//child::a)[10]")
	  public WebElement loggedaccount;
	  public String enteredUsername;
	  
	  public logoutuserPage(WebDriver driver){
		     this.driver = driver; 
		     PageFactory.initElements(driver, this);
		 }
	  public String namedisplay() {
			 String usernameValue = "Mayuri";
		     name.sendKeys(usernameValue);
		     this.enteredUsername = name.getAttribute("value");
		     System.out.println(enteredUsername);
		     return enteredUsername;
		 }
	  public String loggeddispaly() {
			 String loggedaccount1=loggedaccount.getText();
			
			 return loggedaccount1;
		 }
	  public void logoutclick() {
		  logoutbtn.click();
	  }
}
