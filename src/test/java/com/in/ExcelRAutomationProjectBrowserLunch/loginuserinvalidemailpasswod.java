package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.invalidpassword;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;

public class loginuserinvalidemailpasswod extends BrowserLunch {
	
	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	
	@Test
	public void incorrectpasword() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		ru.loginclick();
		loginuserwithcorrectmailpasswordPage lya=new loginuserwithcorrectmailpasswordPage(driver);
		String Actualvalue =lya.loginaccoutvisiblity();
		System.out.println(Actualvalue);
		String Expectedvalue="Login to your account";
		Assert.assertTrue(Actualvalue.contains(Expectedvalue),"Not visble Login to your account");
		
		lya.emailadressdisplay();
		lya.passworddisplays();
		lya.loginclick();
		invalidpassword invaliddis=new invalidpassword(driver);
		String Expectedvalue1="Your email or password is incorrect!";
		Assert.assertEquals(invaliddis.invalidmsg.getText(),Expectedvalue1);
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
