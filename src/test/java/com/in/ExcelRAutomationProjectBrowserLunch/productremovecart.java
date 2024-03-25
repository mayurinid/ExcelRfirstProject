package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.productremovepage;

public class productremovecart extends BrowserLunch{
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
		String Actualvalue=pd.verificationproduct();
		String ExpectedVaalue="ALL PRODUCTS";
		Assert.assertTrue(Actualvalue.equalsIgnoreCase(ExpectedVaalue));
		
		AddproductincartPage apc=new AddproductincartPage(driver);
		apc.hoverOnProduct();
		apc.clickAddToCart();
	
		apc.viewcartclick();
		
		productremovepage pr=new productremovepage(driver);
		String actualvalue2=pr.cartpageverification();
		Assert.assertEquals(actualvalue2, "Shopping Cart");
		pr.productremoveclosebtn();
		pr.emptycartverification();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
