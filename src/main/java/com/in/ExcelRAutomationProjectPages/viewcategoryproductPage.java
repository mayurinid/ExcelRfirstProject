package com.in.ExcelRAutomationProjectPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class viewcategoryproductPage {
	WebDriver driver;

    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement categoryvisual;

    @FindBy(xpath = "//a[contains(@href,'Women')]")
    public WebElement clickwomen;
    
    @FindBy(xpath = "//a[contains(@href,'1')]")
    public WebElement clickdress;
  

    @FindBy(xpath = "//h2[text()='Women - Dress Products']")
    public WebElement titleverification;

    @FindBy(xpath = "//a[contains(@href,'Men')]")
    public WebElement mensclick;
    
    @FindBy(xpath = "(//a[contains(@href,'3')]")
    public WebElement Tshirtclick;
    
    @FindBy(xpath = "(//h2[text()='Brands']")
    public WebElement brandtext;


    public viewcategoryproductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String brandtext() {
    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", brandtext);
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement element=wait.until(ExpectedConditions.visibilityOf(brandtext));
    	String bt=element.getText();
		return bt;
    }
    
public String categoryvisual() {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", categoryvisual);
	String category=categoryvisual.getText();
	System.out.println(category);
	return category;
}
public void clickwomen() {
	
	clickwomen.click();
}
   
public void clickdress() {
	 
	clickdress.click();
}
public String titleverification() {
	String category=titleverification.getText();
	return category;
}
public void mensclick() {
	mensclick.click();
}
public void Tshirtclick() {
	Tshirtclick.click();
}
    
}
