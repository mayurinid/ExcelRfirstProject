package com.in.ExcelRAutomationProjectPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductPage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy (xpath=("(//ul[@class='nav navbar-nav']//child::a)[2]"))
	public WebElement productbtn;
	@FindBy (xpath=("//h2[text()='All Products']"))
	public WebElement productverification;
	@FindBy (xpath=("//div[@class='choose']"))
	public WebElement veiwbtn;
	@FindBy(xpath = "(//div[@class='product-details']")
    public WebElement landedverification; 

	@FindBy (xpath=("//input[@id='search_product']"))
	public WebElement searchtext;
	@FindBy (xpath=("//button[@id='submit_search']"))
	public WebElement searchbtn;
	@FindBy (xpath=("//h2[text()='Searched Products']"))
	public WebElement searchproductverification;
	@FindBy (xpath=("//div[@class='col-sm-7']//h2"))
	public WebElement productname;
	@FindBy (xpath=("//div[@class='col-sm-7']//p"))
	public WebElement category;
	@FindBy (xpath=("//div[@class='col-sm-7']//span//span"))
	public WebElement price;
	@FindBy (xpath=("(//div[@class='product-information']//following::p)[2]"))
	public WebElement availability;
	@FindBy (xpath=("(//div[@class='product-information']//following::p)[3]"))
	public WebElement condition;
	@FindBy (xpath=("(//div[@class='product-information']//following::p)[4]"))
	public WebElement brand;
	@FindBy (xpath=("(//div[@class='overlay-content']//h2"))
	public WebElement pricever;
	@FindBy (xpath=("(//div[@class='overlay-content']//p"))
	public WebElement nameitem;
	
	public SearchProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void productbtnclick() {
		productbtn.click();
	}
	public String verificationproduct() {
		String vp=productverification.getText();
		System.out.println(vp);
		return vp;
	}
	public void productviewbtnclick() {
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", veiwbtn);

		veiwbtn.click();
	}
	 public void landedproduct() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-details']")));
	        
	        if (landedverification.isDisplayed()) {
	            System.out.println("Product page loaded successfully.");
	        } else {
	            System.out.println("Product page failed to load.");
	        }
	    }
	public String productverification() {
		String pn=productname.getText();
		System.out.println(pn);
		return pn;
	}
	public String catogaryverification() {
		String cat=category.getText();
		System.out.println(cat);
		return cat;
	}
	public String priceverification() {
		String p=price.getText();
		System.out.println(p);
		return p;
	}
	public String availabilityverification() {
		String avail=availability.getText();
		System.out.println(avail);
		return avail;
	}
	public String conditionverification() {
		String condi=condition.getText();
		System.out.println(condi);
		return condi;
	}
	public String brandverification() {
		String brandname=brand.getText();
		System.out.println(brandname);
		return brandname;
	}
	public void searchtexts() {
		searchtext.sendKeys("Men Tshirt");
	}
	public void searchbtnclick() {
		searchbtn.click();
	}
	public String searchproductverification() {
		String spv=searchproductverification.getText();
		System.out.println(spv);
		return spv;
	}
	public String itemname() {
		String in=nameitem.getText();
		return in;
	}
	public String pricesub() {
		String ps=pricever.getText();
		return ps;
	}
	
}
