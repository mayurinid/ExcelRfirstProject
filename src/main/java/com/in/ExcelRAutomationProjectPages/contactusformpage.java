package com.in.ExcelRAutomationProjectPages;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactusformpage {
	 WebDriver driver;
	    
	    @FindBy(xpath="(//ul[@class='nav navbar-nav']//a)[8]")
	    public WebElement contactusbtn;
	    
	    @FindBy(xpath="(//div[@class='contact-form']//child::h2[text()='Get In Touch'])")
	    public WebElement gettouchtext1;
	    
	    @FindBy(xpath="(//input[@name='name'])")
	    public WebElement name;
	    
	    @FindBy(xpath="(//input[@name='email'])")
	    public WebElement email;
	    
	    @FindBy(xpath="(//input[@name='subject'])")
	    public WebElement subject;
	    
	    @FindBy(xpath="(//textarea[@name='message'])")
	    public WebElement yourmessage;
	    
	    @FindBy(xpath="(//input[@name='upload_file'])")
	    public WebElement choosefile;
	    
	    @FindBy(xpath="(//input[@name='submit'])")
	    public WebElement submit;
	    
	  
	    @FindBy(xpath="(//div[@class='status alert alert-success'])")
	    public WebElement sucessmessage;
	    @FindBy(xpath="(//a[@class='btn btn-success'])")
	    public WebElement homeclick;
	
	
	 public contactusformpage(WebDriver driver){
	     this.driver = driver; 
	     PageFactory.initElements(driver, this);
	 }
	 
	
	public void contactbtnclick() {
		contactusbtn.click();
	}
	public void namedispaly() {
		name.sendKeys("Mayuri");
	}
	public void emaildisplay() {
		email.sendKeys("rnmayuri08@gmail.com");
	}
	public void subjectdiaplay() {
		subject.sendKeys("my name is mayuri");
	}
	public void messagedisplay() {
		yourmessage.sendKeys("my name is mayuri");
	}
	public void uploadbtn() {
		
		choosefile.click();
	}
	public void selectfil() {
		
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choosefile);
		choosefile.sendKeys("C:\\Users\\mayuri\\OneDrive\\Desktop\\Book1.xlsx");
	}
	
	public String actualvtext() {
		String actualvalu=gettouchtext1.getText();
		return actualvalu;
	}
	
	public void submitclick() {
		submit.click();
	}
	public void alterhandel()
	{
		 Alert alert = driver.switchTo().alert();
		 String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);
	        alert.accept();

	}
	public String message() {
		String messagesucess=sucessmessage.getText();
		System.out.println(messagesucess);
		return messagesucess;
	}
	public void homeclickbtn() {
		homeclick.click();
	}
}
