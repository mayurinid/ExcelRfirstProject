package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;

public class SearchProduct extends BrowserLunch {
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
		
		
		pd.searchtexts();
		pd.searchbtnclick();
		String ActualValue=pd.searchproductverification();
		String Expectedvalue="Searched Products";
		Assert.assertTrue(ActualValue.equalsIgnoreCase(Expectedvalue));
		
		
		

	}
	

@AfterMethod
public void teardown() {
	driver.quit();
}
}