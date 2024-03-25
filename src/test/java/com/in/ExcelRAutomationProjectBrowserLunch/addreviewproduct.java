package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.addreviewproductpage;

public class addreviewproduct extends BrowserLunch{

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void registermethod() {
		
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		SearchProductPage pd=new SearchProductPage(driver);
		pd.productbtnclick();
		String Actualvalue=pd.verificationproduct();
		String ExpectedVaalue="ALL PRODUCTS";
		Assert.assertTrue(Actualvalue.equalsIgnoreCase(ExpectedVaalue));
//		AddproductincartPage apc=new AddproductincartPage(driver);
//		apc.hoverOnProduct();
//		apc.clickAddToCart();
//		apc.continueShopping();
		pd.productviewbtnclick();
		addreviewproductpage arp=new addreviewproductpage(driver);
		String Actualvalue1=arp.addcartreview();
		String ExpectedVaalue1="Write Your Review";
		Assert.assertTrue(Actualvalue1.equalsIgnoreCase(ExpectedVaalue1));
		arp.addcartreviewname();
		arp.addcartreviewemail();
		arp.addcartreviewetext();
		arp.addcartreviewesubmit();
		String Actualvalue2=arp.addcartreviewsucess();
		String ExpectedVaalue2="Thank you for your review.";
		Assert.assertTrue(Actualvalue2.equalsIgnoreCase(ExpectedVaalue2));
	}
	@AfterMethod
	public void tearclose() {
		driver.close();
	}

}
