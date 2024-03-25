package com.in.ExcelRAutomationProjectBrowserLunch;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;

public class RegisterUser extends BrowserLunch {
	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void registeruser() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		ru.loginclick();
		String Actualvalue =ru.newUserSignupvisible();
		String Expectedvalue="New User Signup!";
		Assert.assertTrue(Actualvalue.contains(Expectedvalue),"Not visble New User Signup!");
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
		
		String Actualvalueeac =ru.accountcreateddisplay();
		System.out.println(Actualvalueeac);
		String Expectedvalueeac="ACCOUNT CREATED!";
		Assert.assertEquals(Actualvalueeac, Expectedvalueeac);
		ru.continuebuttonclick();

		
		String Actualvalueofaccountcreated =ru.loggeddispaly();
		System.out.println(Actualvalueofaccountcreated);
		String a="Logged in as ";
		String ExpectedValueofaccountcreated=a+ru.enteredUsername;
		System.out.println(a+ru.enteredUsername);
		Assert.assertEquals(Actualvalueofaccountcreated,ExpectedValueofaccountcreated);
		

		
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
