package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.viewcartbrandPage;

public class viewcartbrand extends BrowserLunch{

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
		viewcartbrandPage vcb=new viewcartbrandPage(driver);
		System.out.println(vcb.brandstext());
		String Actualvalue=vcb.brandstext();
		String Expectedvalue="Brands";
		Assert.assertTrue(Actualvalue.equalsIgnoreCase(Expectedvalue));
		vcb.poloclickdisplay();
		String Actualvalue1=vcb.brandsproducttext();
		String Expectedvalue1="Brand - Polo Products";
		Assert.assertTrue(Actualvalue1.equalsIgnoreCase(Expectedvalue1));
		vcb.hmclickdisplay();
		String Actualvalue2=vcb.hmproducttext();
		String Expectedvalue2="Brand - H&M Products";
		Assert.assertTrue(Actualvalue2.equalsIgnoreCase(Expectedvalue2));
}
}
