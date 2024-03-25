package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginuserwithcorrectmailpasswordPage {
	WebDriver driver;
	 
	  @FindBy (xpath="//h2[text()='Login to your account']") 
	  public WebElement loginyouraccoutvisiblity;
	  @FindBy (xpath="(//input[@name='email'])[1]") 
	  public WebElement emailaddress;
	  @FindBy(xpath="(//form[@method='POST']//input[@name='password'])") 
	    public WebElement password12;
	  @FindBy (xpath="(//ul[@class='nav navbar-nav']//child::a)[4]")
	   public WebElement logoutbtn;
	  @FindBy (xpath="//button[text()='Login']") 
	  public WebElement loginbtn;
	  
	  public loginuserwithcorrectmailpasswordPage(WebDriver driver){
		     this.driver = driver; 
		     PageFactory.initElements(driver, this);
		 }
	  public String loginaccoutvisiblity() {
			 String loginaccoutvisiblit=loginyouraccoutvisiblity.getText();
			 System.out.println(loginaccoutvisiblit);
			 return loginaccoutvisiblit;
		 }
	  public void emailadressdisplay() {
			 emailaddress.sendKeys("rnmayuri08@gmail.com");
				
			 }
	  
	  public void passworddisplays() {
		  password12.sendKeys("rnmayuri08");
	  }
	  public void loginclick() {
		  loginbtn.click();
	  }
	  public void logoutclick() {
		  logoutbtn.click();
	  }
}
