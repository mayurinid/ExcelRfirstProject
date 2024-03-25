package com.in.ExcelRAutomationProjectPages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddproductincartPage {
	WebDriver driver;
	 @FindBy(xpath = "//div[@class='product-overlay']")
	    public WebElement mouseHoverOn;
    
    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public WebElement clickAddToCart;
    
    @FindBy(xpath = "  (//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement clickAddToCart2;
  

    @FindBy(xpath = "//div[@class='modal-footer']")
    public WebElement continueShoppingBtn;

    @FindBy(xpath = "(//p[@class='text-center'])[2]//u")
    public WebElement viewcartbtn;
    

    
    
    
    @FindBy(xpath = "(//td[@class='cart_price'])[1]")
    public WebElement getFirstProductPrice;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement getFirstProductQuantity;
    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement getFirstProductTotalPrice;

    @FindBy(xpath = "(//td[@class='cart_price'])[2]")
    public WebElement getSecondProductPrice;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement getSecondProductQuantity;


    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement getSecondProductTotalPrice;

    public AddproductincartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void hoverOnProduct() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverOn).perform();
    }

    public void clickAddToCart() {
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickAddToCart);
        clickAddToCart.click();
    }
    

    public void continueShopping() {
        continueShoppingBtn.click();
    }
    public void viewcartclick() {
viewcartbtn.click();
    }
    public void clickAddToCart2() {
   	 
       clickAddToCart2.click();
   }
    public String getFirstProductPrice() {
    	String s=getFirstProductPrice.getText();
    	return s;
    }
    public String getFirstProductQuantity() {
    	String p=getFirstProductQuantity.getText();
    	return p;
    }
public String getFirstProductTotalPrice() {
	String p=getFirstProductTotalPrice.getText();
	return p;
    }
    public String getSecondProductPrice() {
    	String p=getSecondProductPrice.getText();
    	return p;
    }
public String getSecondProductQuantity() {
	String p=getSecondProductQuantity.getText();
	return p;
    }
    public String getSecondProductTotalPrice() {
    	String p=getSecondProductTotalPrice.getText();
    	return p;	
    }
   
}
