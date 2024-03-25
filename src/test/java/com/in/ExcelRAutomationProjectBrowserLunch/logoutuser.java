package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;
import com.in.ExcelRAutomationProjectPages.logoutuserPage;

public class logoutuser extends BrowserLunch{
	
	@BeforeSuite
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
			Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
			ru.loginclick();
			
			String Actualvalue =lya.loginaccoutvisiblity();
			System.out.println(Actualvalue);
			String Expectedvalue="Login to your account";
			Assert.assertTrue(Actualvalue.contains(Expectedvalue),"Not visble Login to your account");
			
			lya.emailadressdisplay();
			lya.passworddisplays();
			lya.loginclick();
			
//			logoutuserPage logoutu=new logoutuserPage(driver);
//			String Actualvalueofaccountcreated =logoutu.loggeddispaly();
//			System.out.println(Actualvalueofaccountcreated);
//			String a="Logged in as ";
//			String ExpectedValueofaccountcreated=a+logoutu.enteredUsername;
//			System.out.println(a+logoutu.enteredUsername);
//			Assert.assertEquals(Actualvalueofaccountcreated,ExpectedValueofaccountcreated);
			logoutuserPage ly=new logoutuserPage(driver);
			ly.logoutclick();lya.logoutclick();

		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
