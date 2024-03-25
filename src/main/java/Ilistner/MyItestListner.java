package Ilistner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.in.utility.Extendrepotrsdetails;

public class MyItestListner implements ITestListener {
	ExtentReports extent;
	WebDriver driver;
	ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
		extent=Extendrepotrsdetails.generateextendreports();
	}
	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();	
		extentTest = extent.createTest(testname);
		extentTest.log(Status.INFO,testname+"started executing");
	}  

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();	
		extentTest.log(Status.INFO,testname+"got sucessfully excuted");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		
		
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			
			e.printStackTrace();
		}  
	File srcScreennshot=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(testname+"got failed");	
	System.out.println(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();	
	    System.out.println(testname+"got skipped");	
	System.out.println(result.getThrowable());
	}

		@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished Executing Project");
	}

}
