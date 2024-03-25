package com.in.ExcelRAutomationProjectBrowserLunch;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SubscriptionPage;

public class scrollarrow extends BrowserLunch{

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
public void addcart() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		SubscriptionPage sp=new SubscriptionPage(driver);
		sp.subscrtiontextdisplay();
//		sp.subscriptionarrowbtn();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0);");
		sp.verificationarr();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
