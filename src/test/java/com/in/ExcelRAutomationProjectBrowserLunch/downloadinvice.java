package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.addcartrecommendeditrmPage;
import com.in.ExcelRAutomationProjectPages.increaseqtyincart;
import com.in.ExcelRAutomationProjectPages.registercheckoutpage;

public class downloadinvice extends BrowserLunch{

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
		AddproductincartPage apc=new AddproductincartPage(driver);
		apc.hoverOnProduct();
		apc.clickAddToCart();
		apc.continueShopping();
		registercheckoutpage rc=new registercheckoutpage(driver);
		rc.cartclick();
		rc.checkclick();
		rc.regissterlog();
		
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
		
		rc.cartclick();
		rc.checkclick();
		
		rc.discription();
		rc.placeorderbtn();
		rc.nameoncard();
		rc.cardnumber();
		rc.cvc();
		rc.expirymonth();
		rc.expiryyear();
		rc.payorderbtn();
//		String actualvalue2=rc.sucessmessage();
//		System.out.println(actualvalue2);
//		String exceptedvalue="Your order has been placed successfully!";
//		Assert.assertTrue(actualvalue2.equalsIgnoreCase(exceptedvalue) );
		addcartrecommendeditrmPage acri=new addcartrecommendeditrmPage(driver);
		acri.downloadinvioce();
		acri.continuebtn();

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
