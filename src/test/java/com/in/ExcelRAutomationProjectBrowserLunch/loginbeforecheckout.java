package com.in.ExcelRAutomationProjectBrowserLunch;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.AddproductincartPage;
import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.SearchProductPage;
import com.in.ExcelRAutomationProjectPages.increaseqtyincart;
import com.in.ExcelRAutomationProjectPages.loginuserwithcorrectmailpasswordPage;
import com.in.ExcelRAutomationProjectPages.registercheckoutpage;

public class loginbeforecheckout extends BrowserLunch{
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
		
	}
	@Test
	public void registeralready() {
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
		
		SearchProductPage pd=new SearchProductPage(driver);
		pd.productbtnclick();
		AddproductincartPage apc=new AddproductincartPage(driver);
		apc.hoverOnProduct();
		apc.clickAddToCart();
		apc.continueShopping();
		
		registercheckoutpage rc=new registercheckoutpage(driver);
		rc.cartclick();
		rc.checkclick();
//		Assert.assertEquals(pd.productverification(), "Blue Top");
//
//		Assert.assertEquals(pd.priceverification(), "Rs. 500");
//		Assert.assertEquals(pd.availabilityverification(), "Availability: In Stock");
		
		
		increaseqtyincart piq=new increaseqtyincart(driver);
		
		String actualvalue=piq.getProductQuantity();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "1");
		rc.discription();
		rc.placeorderbtn();
		rc.nameoncard();
		rc.cardnumber();
		rc.cvc();
		rc.expirymonth();
		rc.expiryyear();
		String actualvalue2=rc.sucessmessage();
		System.out.println(actualvalue2);
//		Assert.assertEquals(actualvalue, "Your order has been placed successfully!");
		rc.payorderbtn();

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
