package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.increaseqtyincart;

public class ProductQuantityincart extends BrowserLunch {
	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void productdetailpage() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		SearchProductPage pd=new SearchProductPage(driver);
		pd.productbtnclick();
		String Actualvalue=pd.verificationproduct();
		String ExpectedVaalue="ALL PRODUCTS";
		Assert.assertTrue(Actualvalue.equalsIgnoreCase(ExpectedVaalue));
		
		
		pd.productviewbtnclick();
		Assert.assertEquals(pd.productverification(), "Blue Top");
		Assert.assertEquals(pd.catogaryverification(), "Category: Women > Tops");
		Assert.assertEquals(pd.priceverification(), "Rs. 500");
		Assert.assertEquals(pd.availabilityverification(), "Availability: In Stock");
		Assert.assertEquals(pd.conditionverification(), "Condition: New");
		Assert.assertEquals(pd.brandverification(), "Brand: Polo");
		
		increaseqtyincart piq=new increaseqtyincart(driver);
		piq.inceasequantity();
		piq.clickAddToCart();
		piq.viewcartclick();
		String actualvalue=piq.getProductQuantity();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "4");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
