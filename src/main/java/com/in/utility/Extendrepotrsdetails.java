package com.in.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendrepotrsdetails {
	public static ExtentReports generateextendreports() {
		ExtentReports extentReport=new ExtentReports();
		File extentreportsfile=new File(System.getProperty("user.dir")+"\\test-output\\ExtentReport\\ExtentReport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(extentreportsfile);
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("ExcelR project Report");
		spark.config().setDocumentTitle("First Project Report");
		spark.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		extentReport.attachReporter(spark);
		return extentReport;
		
	}

}
