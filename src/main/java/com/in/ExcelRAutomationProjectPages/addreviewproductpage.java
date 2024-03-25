package com.in.ExcelRAutomationProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addreviewproductpage {
	WebDriver driver;

    @FindBy(xpath = "//a[contains(@href,'reviews')]")
    public WebElement addcartreview;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement addcartreviewname;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement addcartreviewemail;
    @FindBy(xpath = "//textarea[@name='review']")
    public WebElement addcartreviewetext;
    @FindBy(xpath = "//button[@id='button-review']")
    public WebElement addcartreviewesubmit;
    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    public WebElement addcartreviewesucess;
    public addreviewproductpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String addcartreview() {
    	String acrv=addcartreview.getText();
    	return acrv;
    }
    public void addcartreviewname() {
    	addcartreviewname.sendKeys("Mayuri");
    }
    public void addcartreviewemail() {
    	addcartreviewemail.sendKeys("rnmayuri08@gmail.com");
    }
    public void addcartreviewetext() {
    	addcartreviewetext.sendKeys("This is first Excelrproject");
    }
    public void addcartreviewesubmit() {
    	addcartreviewesubmit.click();
    }
    public String addcartreviewsucess() {
    	String acrv=addcartreviewesucess.getText();
    	return acrv;
    }
}
