package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registercheckoutpage {
WebDriver driver;
@FindBy (xpath="(//ul[@class='nav navbar-nav']//child::a)[3]") 
public WebElement cart;
	  @FindBy (xpath="//a[@class='btn btn-default check_out']")
	   public WebElement checkout;
	  @FindBy(xpath ="//li[@class='address_firstname address_lastname']")
	  public WebElement address;
	  @FindBy (name="message")
	  public WebElement discription;
	  @FindBy(xpath ="(//a[text()='Place Order'])")
	  public WebElement placeorder;
	  
	  @FindBy(xpath ="(//input[@name='name_on_card'])")
	  public WebElement nameoncard;
	  @FindBy(xpath ="(//input[@name='card_number'])")
	  public WebElement cardnumber;
	  @FindBy(xpath ="(//input[@name='cvc'])")
	  public WebElement cvc;
	  @FindBy(xpath ="(//input[@name='expiry_month'])")
	  public WebElement expirytmonth;
	  @FindBy(xpath ="(//input[@name='expiry_year'])")
	  public WebElement expiryyear;
	  @FindBy(xpath ="(//div[@class='alert-success alert'])")
	  public WebElement sucessmessage;
	  @FindBy(xpath ="(//button[@id='submit'])")
	  public WebElement payorderbtn;
	  
	  public registercheckoutpage(WebDriver driver){
		     this.driver = driver; 
		     PageFactory.initElements(driver, this);
		 }

public void cartclick() {
	cart.click();
}
public void checkclick() {
	checkout.click();
}
public void regissterlog() {
	WebElement registerlogin = driver.findElement(By.xpath("//u[text()='Register / Login']"));

	registerlogin.click();
}
public String adreesvrify() {
String a=address.getText();
System.out.println(a);
	return a;
}
public void discription() {
	discription.sendKeys("mayuri address details");
}
public void placeorderbtn() {
	placeorder.click();
}
public void nameoncard() {
	nameoncard.sendKeys("Mayuri Nidebane");
}
public void cardnumber() {
	cardnumber.sendKeys("Mayuri Nidebane");
}
public void cvc() {
	cvc.sendKeys("300");
}
public void expirymonth() {
	expirytmonth.sendKeys("05");
}
public void expiryyear() {
	expiryyear.sendKeys("2025");
}
public String sucessmessage() {
	String sm=sucessmessage.getText();
	System.out.println(sm);
	return sm;
}
public void payorderbtn() {
	payorderbtn.click();
}
}