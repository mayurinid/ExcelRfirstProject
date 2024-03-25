package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class increaseqtyincart {
	WebDriver driver;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantitybtn;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement clickAddToCartbtn;
    
    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement viewcartbtn;
    
//    @FindBy(xpath = "(//td[@class='cart_quantity']//button[text()='4']")
//    public WebElement qtytext;
    
    public increaseqtyincart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void inceasequantity() {
     	 
    	quantitybtn.clear();
    	quantitybtn.sendKeys("4");
    }
    public void clickAddToCart() {
      	 
    	clickAddToCartbtn.click();
    }
    public void viewcartclick() {
    	viewcartbtn.click();
   }
    public String getProductQuantity() {
    	WebElement qtytext = driver.findElement(By.xpath("//td[@class='cart_quantity']//button[text()='4']"));

    	String p=qtytext.getText();
    	return p;
    }
    
}
