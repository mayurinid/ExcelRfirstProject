package com.in.ExcelRAutomationProjectBrowserLunch;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelRAutomationProjectPages.RegisteruserPage;
import com.in.ExcelRAutomationProjectPages.contactusformpage;

public class contactusform extends BrowserLunch {

	@BeforeMethod
	public void browseropening() {
		Loadproperties();
		browserLunchMethod();
	}
	@Test
	public void contactusfor() {
		RegisteruserPage ru=new RegisteruserPage(driver);
		Assert.assertTrue(ru.homepagedisplay(),"home page is not visible successfully");
		contactusformpage contactusform=new contactusformpage(driver);
		contactusform.contactbtnclick();

		String Expectedvalue="Get In Touch";
		System.out.println(contactusform.actualvtext());
		Assert.assertTrue(contactusform.gettouchtext1.getText().equalsIgnoreCase(Expectedvalue));

		contactusform.namedispaly();
		contactusform.emaildisplay();
		contactusform.subjectdiaplay();
		contactusform.messagedisplay();

		contactusform.selectfil();
		contactusform.submitclick();
		contactusform.alterhandel();
		String ActualValue=contactusform.message();
		String Expectedmessage="Success! Your details have been submitted successfully.";
		Assert.assertTrue(ActualValue.contains(Expectedmessage));
		contactusform.homeclickbtn();
	

	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
