package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.SubscriptionPage;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;
import com.in.ExcelRAutomationProjectPages.productremovepage;

public class searchproductcart extends BrowserLunch {
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
		AddproductincartPage apc=new AddproductincartPage(driver);
		apc.hoverOnProduct();
		apc.clickAddToCart();
		apc.continueShopping();
		SubscriptionPage sp=new SubscriptionPage(driver);
		sp.cartclickbt();
		productremovepage pr=new productremovepage(driver);
		String actualvalue2=pr.cartpageverification();
		Assert.assertEquals(actualvalue2, "Shopping Cart");
		
		ru.loginclick();
		loginuserwithcorrectmailpasswordPage lya=new loginuserwithcorrectmailpasswordPage(driver);
		lya.emailadressdisplay();
		lya.passworddisplays();
		lya.loginclick();
		sp.cartclickbt();	
	
		Assert.assertEquals(actualvalue2, "Shopping Cart");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
