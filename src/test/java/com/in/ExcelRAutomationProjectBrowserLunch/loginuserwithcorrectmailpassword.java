package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;
import com.in.ExcelRAutomationProjectPages.logoutuserPage;

public class loginuserwithcorrectmailpassword extends BrowserLunch{
	
	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test(priority=1)
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
		logoutuserPage ly=new logoutuserPage(driver);
		ly.logoutclick();
	}
	@Test(priority=2)
	public void login() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		ru.loginclick();
		loginuserwithcorrectmailpasswordPage lya=new loginuserwithcorrectmailpasswordPage(driver);
		String Actualvalue =lya.loginaccoutvisiblity();
		System.out.println(Actualvalue);
		String Expectedvalue="Login to your account";
		Assert.assertTrue(Actualvalue.contains(Expectedvalue),"Not visble Login to your account");
		
		lya.emailadressdisplay();
		lya.passworddisplays();
		lya.loginclick();
		
        ru.deleteaccountclick();
		
		String Actualvalueofdeletever =ru.verifydeletedaccount();
		System.out.println(Actualvalueofdeletever);
		String Expectedvalueofdeleteaccountverify = "ACCOUNT DELETED!";
		Assert.assertEquals(Actualvalueofdeletever, Expectedvalueofdeleteaccountverify);
		ru.continuebuttonclick();
		

		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
