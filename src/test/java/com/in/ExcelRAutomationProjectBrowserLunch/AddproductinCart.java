package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;

public class AddproductinCart extends BrowserLunch{

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
public void addcart() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		SearchProductPage pd=new SearchProductPage(driver);
		pd.productbtnclick();
		AddproductincartPage apc=new AddproductincartPage(driver);
		apc.hoverOnProduct();
		apc.clickAddToCart();
		apc.continueShopping();
		apc.clickAddToCart2();
		apc.viewcartclick();
	
		
		 String firstProductPrice = apc.getFirstProductPrice();
		 String firstProductQuantity = apc.getFirstProductQuantity();
	        String firstProductTotalPrice = apc.getFirstProductTotalPrice();

	        String secondProductPrice = apc.getSecondProductPrice();
	        String secondProductQuantity = apc.getSecondProductQuantity();
	        String secondProductTotalPrice = apc.getSecondProductTotalPrice();

	        // Verify product details
	        Assert.assertEquals(firstProductPrice, "Rs. 500");
	        Assert.assertEquals(firstProductQuantity, "1", "Quantity of first product is not as expected");
	        Assert.assertEquals(firstProductTotalPrice, "Rs. 500");

	        Assert.assertEquals(secondProductPrice, "Rs. 400");
	        Assert.assertEquals(secondProductQuantity, "1", "Quantity of second product is not as expected");
	        Assert.assertEquals(secondProductTotalPrice, "Rs. 400");
}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}