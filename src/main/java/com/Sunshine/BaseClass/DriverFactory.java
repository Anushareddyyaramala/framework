//package com.Sunshine.BaseClass;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Reporter;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DriverFactory {
//
//	
//	WebDriver driver;
//	
//	
//	public void  launch(String BROWSER) {
//		String URL=pUtil.readDataFromPropertyFile("url");
//	
//		
//		if(BROWSER.equalsIgnoreCase("CHROME"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
//			
//		}
//		else if(BROWSER.equalsIgnoreCase("FIREFOX"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
//		}
//		else
//		{
//			System.out.println("invalid browser");
//		}
//		
//		
//	}
//	
//}
