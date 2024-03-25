package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisteruserPage {
	WebDriver driver;
  @FindBy (xpath="//img[contains(@src,'/static/images/home/logo.png')]") 
  public WebElement Logoselected;
  @FindBy (xpath="//a[contains(text(),' Signup / Login')]") 
  public WebElement Login;
  @FindBy (xpath="//h2[text()='New User Signup!']") 
  public WebElement newUserSignupvisiblity;
  @FindBy (xpath="//input[@name='name']") 
  public WebElement name;
  @FindBy (xpath="(//input[@name='email'])[2]") 
  public WebElement emailaddress;
  @FindBy (xpath="//button[text()='Signup']") 
  public WebElement Signup;
  @FindBy (xpath="//b[text()='Enter Account Information']") 
  public WebElement eaivisibility;
  @FindBy (xpath="//input[@id='id_gender2']") 
  public WebElement checkradio;
  @FindBy (xpath="//input[@id='password']") 
  public WebElement password;
  @FindBy(xpath="//select[@id='days']")
  public WebElement daysElement;

  @FindBy(xpath="//select[@id='months']")
  public WebElement monthsElements;

  @FindBy(xpath="//select[@id='years']")
  public WebElement yearsElement;
  @FindBy(xpath = "(//div[@class='checkbox'])[1]")
  public WebElement newsletterCheckbox;

  @FindBy(xpath = "(//div[@class='checkbox'])[2]")
  public WebElement patternCheckbox;
  
  @FindBy(xpath = "//input[@id='first_name']")
  public WebElement firstname;
  @FindBy(xpath = "//input[@id='last_name']")
  public WebElement lastname;
  @FindBy(xpath = "//input[@id='company']")
  public WebElement companyname;
  @FindBy(xpath = "//input[@id='address1']")
  public WebElement addressname1;
  @FindBy(xpath = "//input[@id='address2']")
  public WebElement addressname2;
  @FindBy(xpath = "//input[@id='state']")
  public WebElement statename;
  @FindBy(xpath = "//input[@id='city']")
  public WebElement cityname;
  @FindBy(xpath = "//input[@id='zipcode']")
  public WebElement zipcodes;
  @FindBy(xpath = "//input[@id='mobile_number']")
  public WebElement mobilenumber;
  @FindBy(xpath = "//button[text()='Create Account']")
  public WebElement createbutton;
  
  @FindBy(xpath = "//b[text()='Account Created!']")
  public WebElement accountcreated;
  @FindBy(xpath = "//a[text()='Continue']")
  public WebElement continuebutton;
  @FindBy(xpath = "//a[text()=' Delete Account']")
  public WebElement deleteaccount;
  @FindBy(xpath = "(//ul[@class='nav navbar-nav']//child::a)[10]")
  public WebElement loggedaccount;
  @FindBy(xpath = "//b[text()='Account Deleted!']")
  public WebElement verifydeleteaccount;
  @FindBy(xpath = "//div[@id='dismiss-button']")
  public WebElement closebutton;

public String enteredUsername;

  
  
  
 public RegisteruserPage(WebDriver driver){
     this.driver = driver; 
     PageFactory.initElements(driver, this);
 }
 
 public boolean homepagedisplay() {
	 boolean Logodis=Logoselected.isDisplayed();
	 return Logodis;
 }
 public void loginclick() {
	 Login.click();
 }
 public String newUserSignupvisible() {
	 String newsignupvisibility=newUserSignupvisiblity.getText();
	 return newsignupvisibility;
 }
 public String namedisplay() {
	 String usernameValue = "Mayuri";
     name.sendKeys(usernameValue);
     this.enteredUsername = name.getAttribute("value");
     System.out.println(enteredUsername);
     return enteredUsername;
 }
 public void emailadressdisplay() {
	 emailaddress.sendKeys("rnmayuri08@gmail.com");
		
	 }
 
 public void signupclick() {
	 Signup.click();
 }
 public String enteraccountvisible() {
	 String eavisibility=eaivisibility.getText();
	 System.out.println(eavisibility);
	 return eavisibility;
 }
 public void radioclick() {
	 checkradio.click();
 }

 public void passworddisplay() {
	 password.sendKeys("rnmayuri08");
		
	 }
 public void daysdisplay() {
     Select days = new Select(daysElement);
     days.selectByIndex(8);
 }
 public void monthsdisplay() {
     Select months = new Select(monthsElements);
     months.selectByValue("7");
 }
 public void yearsdisplay() {
     Select years = new Select(yearsElement);
     years.selectByValue("1990");
 }
 public void newslettercheck1() {
	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletterCheckbox);
	 

	 newsletterCheckbox.click();
 }
 public void checkpattern1() {
	
	 patternCheckbox.click();
 }
 public void fistname() {
	 firstname.sendKeys("Mayuri");
 }
 public void lastname() {
	 lastname.sendKeys("Nidebane");
 }
 public void companynames() {
	 companyname.sendKeys("GNDECB");
 }
 public void adressnames() {
	 addressname1.sendKeys("C/o Raghunath C N");
 }
 public void adressnames2() {
	 addressname2.sendKeys("Mahesh Nagar Bidar");
 }
 public void statenames() {
	 statename.sendKeys("Karnataka");
 }
 public void citynames() {
	 cityname.sendKeys("Bidar");
 }
 public void zipcod() {
	 zipcodes.sendKeys("585401");
 }
 public void mobilenum() {
	 mobilenumber.sendKeys("9591174005");
 }
 public void createbuttonclick()
 {
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createbutton);
	 createbutton.click();
 }
 public String accountcreateddisplay() {
	 String accountdispayed=accountcreated.getText();
	 System.out.println(accountdispayed);
	 return accountdispayed;
 }
 public void continuebuttonclick()
 {
	 continuebutton.click();
 }
 public String loggeddispaly() {
	 String loggedaccount1=loggedaccount.getText();
	
	 return loggedaccount1;
 }
public void deleteaccountclick() {
	deleteaccount.click();
}
public String verifydeletedaccount() {
String deleteaccountverify=verifydeleteaccount.getText();
System.out.println(deleteaccountverify);
return deleteaccountverify;
}
public void closedbtn() {
	closebutton.click();
}
}
