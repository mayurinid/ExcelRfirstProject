package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.SubscriptionPage;
import com.in.ExcelRAutomationProjectPages.addcartrecommendeditrmPage;
import com.in.ExcelRAutomationProjectPages.productremovepage;

public class addcrtrecommendeditems extends BrowserLunch{

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
public void addcart() {
		addcartrecommendeditrmPage acri=new addcartrecommendeditrmPage(driver);
		String actualitem=acri.recommendeditems();
		String expectedvalue="recommended items";
		Assert.assertTrue(actualitem.equalsIgnoreCase(expectedvalue));
		AddproductincartPage apc=new AddproductincartPage(driver);
		
		apc.clickAddToCart();
		apc.viewcartclick();
			
		productremovepage pr=new productremovepage(driver);
		String actualvalue2=pr.cartpageverification();
		Assert.assertEquals(actualvalue2, "Shopping Cart");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}


