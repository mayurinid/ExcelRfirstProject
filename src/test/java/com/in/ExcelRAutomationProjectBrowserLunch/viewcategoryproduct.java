package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.viewcategoryproductPage;

public class viewcategoryproduct extends BrowserLunch{

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
			viewcategoryproductPage vcp=new viewcategoryproductPage(driver);
			String actualvalue=vcp.brandtext();
			System.out.println(actualvalue);
//			String actualvalue=vcp.categoryvisual();
//			Assert.assertTrue(actualvalue.equalsIgnoreCase("categoty"));
			vcp.clickwomen();
			vcp.clickdress();
			String actualvalue1=vcp.titleverification();
			Assert.assertTrue(actualvalue1.equalsIgnoreCase("Women - Dress Products"));
			vcp.mensclick();
      	vcp.Tshirtclick();
			Assert.assertTrue(actualvalue1.equalsIgnoreCase("Men - Tshirts Products"));
			
			
			
			
		}
}


