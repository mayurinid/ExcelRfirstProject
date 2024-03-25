package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productremovepage {
	WebDriver driver;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[@class='active']")
    public WebElement shopingverification;
    
    @FindBy(xpath ="//a[@class='cart_quantity_delete']")
    public WebElement productremoveclosebtn;

    @FindBy(xpath = "//span[@id='empty_cart']")
    public WebElement emptycartverification;
    
   
    public productremovepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String cartpageverification() {
    	String cartpageveri=shopingverification.getText();
    	System.out.println(cartpageveri);
    	return cartpageveri;
    }
    public void productremoveclosebtn() {
    	productremoveclosebtn.click();
    }
public String emptycartverification() {
	String emptycart=emptycartverification.getText();
	return emptycart;
}
}
