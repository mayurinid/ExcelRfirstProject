package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.testcaseverifyPage;

public class TestCasesVerify extends BrowserLunch{

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void testcaseverifypage() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		testcaseverifyPage tc=new testcaseverifyPage(driver);
		tc.testcaseclick();
		String Actualverify=tc.testcaseveri();
		System.out.println(Actualverify);
		String Expectedvalue="Test Cases";
	
		Assert.assertTrue(Actualverify.equalsIgnoreCase(Expectedvalue));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
