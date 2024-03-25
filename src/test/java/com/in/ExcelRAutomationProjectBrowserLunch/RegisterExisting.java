package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.invalidpassword;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;

public class RegisterExisting extends BrowserLunch{
	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void correctmailpassword() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		ru.loginclick();
		
		ru.namedisplay();
		ru.emailadressdisplay();
		ru.signupclick();
		String Actualvalueeai =ru.enteraccountvisible();
		System.out.println(Actualvalueeai);
		String Expectedvalueeai="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(Actualvalueeai, Expectedvalueeai);
		ru.radioclick();
		ru.passworddisplay();
		ru.daysdisplay();
		ru.monthsdisplay();
		ru.yearsdisplay();
		ru.newslettercheck1();
		ru.checkpattern1();
		ru.fistname();
		ru.lastname();
		ru.companynames();
		ru.adressnames();
		ru.adressnames2();
		ru.statenames();
		ru.citynames();
		ru.zipcod();
		ru.mobilenum();
		ru.createbuttonclick();
		ru.continuebuttonclick();
		loginuserwithcorrectmailpasswordPage lya=new loginuserwithcorrectmailpasswordPage(driver);
		lya.logoutclick();
	}
	@Test(priority=2)
	public void registeralready() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		ru.loginclick();
		String Actualvalue=ru.newUserSignupvisible();
		String Expectedvalue="New User Signup!";
		Assert.assertTrue(Actualvalue.contains(Expectedvalue),"Not visble New User Signup!");
		ru.namedisplay();
		ru.emailadressdisplay();
		ru.signupclick();
		invalidpassword invaliddi=new invalidpassword(driver);
		String Expectedvalue2="Email Address already exist!";
		
		Assert.assertEquals(invaliddi.alreadyregistermsg.getText(),Expectedvalue2);
        
		
		
	}
		
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
}
