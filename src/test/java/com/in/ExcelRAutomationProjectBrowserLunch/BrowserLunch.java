package com.in.ExcelRAutomationProjectBrowserLunch;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunch {
	WebDriver driver;
	public Properties prop;
	public void Loadproperties() {
		prop=new Properties();
		File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\in\\ExcelRAutomationProjectPages\\config.properties");
		try {
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public void browserLunchMethod() {
		System.out.println(prop.getProperty("browserName"));
		String browserNam=prop.getProperty("browserName");
		if(browserNam.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browserNam.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Provide Valid Browsername");
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().deleteAllCookies();	
	driver.get(prop.getProperty("url"));
	}

}
