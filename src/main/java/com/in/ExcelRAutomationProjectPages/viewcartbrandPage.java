package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewcartbrandPage {
	WebDriver driver;

    @FindBy(xpath ="//h2[text()='Brands']")
    public WebElement brandstext;
    @FindBy(xpath ="//a[contains(@href,'Polo') and text()='Polo']")
    public WebElement poloclick;
    @FindBy(xpath ="//h2[text()='Brand - Polo Products']")
    public WebElement brandsproducttext;
    @FindBy(xpath ="//a[contains(@href,'H&M') and text()='H&M']")
    public WebElement hmclick;
    @FindBy(xpath ="//h2[text()='Brand - H&M Products']")
    public WebElement hmproducttext;
    public viewcartbrandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String brandstext() {
    	String b=brandstext.getText();
    	System.out.println(b);
    	return b;
    }
    public void poloclickdisplay() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", poloclick);
    	poloclick.click();
    }
    public String brandsproducttext() {
    	String bp=brandsproducttext.getText();
    	System.out.println(bp);
    	return bp;
    }
    public void hmclickdisplay() {
        	hmclick.click();
    }
    public String hmproducttext() {
    	String hbp=hmproducttext.getText();
    	System.out.println(hbp);
    	return hbp;
    }
    
}
