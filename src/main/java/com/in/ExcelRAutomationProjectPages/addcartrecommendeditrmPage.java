package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcartrecommendeditrmPage {
WebDriver driver;
@FindBy (xpath="//h2[text()='recommended items']")
public WebElement recommendeditems;
@FindBy (xpath="//a[@class='btn btn-default check_out']")
public WebElement downloadinvioce;
@FindBy (xpath="//a[@class='btn btn-primary']")
public WebElement continuebtn;
public addcartrecommendeditrmPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public String recommendeditems() {
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",recommendeditems);
	String ri=recommendeditems.getText();
	return ri;
}
public void downloadinvioce() {
	downloadinvioce.click();
}
public void continuebtn() {
	continuebtn.click();
}
}
