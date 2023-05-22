package com.Sunshine.BaseClass;

	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Sunshine.utils.JSONUtility;
import com.Sunshine.utils.JavaUtility;
import com.Sunshine.utils.LogUtility;
import com.Sunshine.utils.PropertyFileUtility;
import com.Sunshine.utils.WebdriverUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
	

	/**
	 * This class contains basic configuration annotation for common 
	 * functionalities like connection to database, launch the browser etc
	 * @author Anusha Y
	 *
	 */
	public class BaseTest {
		
		
		public JavaUtility jUtil = new JavaUtility();
		public JSONUtility json=new JSONUtility();
		public WebdriverUtilities wUtil = new WebdriverUtilities();
		public PropertyFileUtility pUtil = new PropertyFileUtility();
		LogUtility log=new LogUtility();
		public WebDriver driver =null;
		public static WebDriver sdriver;

@Parameters("BROWSER")
		@BeforeClass
		public void bcConfig(String BROWSER) throws IOException
		{
//			String BROWSER1 = pUtil.readDataFromPropertyFile("browser");
			String URL = pUtil.readDataFromPropertyFile("Url");
			if(BROWSER.equalsIgnoreCase("CHROME"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
//				driver.get(URL);
			}
			else if(BROWSER.equalsIgnoreCase("FIREFOX"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
				
			}
			else if(BROWSER.equalsIgnoreCase("EDGE"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
			}
			else
			{
				System.out.println("invalid browser");
			}
			
			sdriver = driver;
			wUtil.maximiseWindow(driver);
			wUtil.waitForElementsToLoadInDOM(driver);
             driver.get(URL);
             log.info("url launched");
            
		}
		
		public void amConfig()
	{
			Reporter.log("--Signout successfull--", true);
		}
		
			 
		

//		@AfterClass
//		public void acConfig()
//		{
//			driver.close();
//			Reporter.log("--browser closed successfull--", true);
//		}
//		
//		@AfterSuite(groups = {"SmokeSuite","RegressionSuite"})
////		public void asConfig() throws SQLException
////		{
////			//dUtil.closeDB();
////			Reporter.log("--Database close successfull--", true);
////		}
//		
		public void clickElement(WebElement ele) {
			ele.click();
		}
//		public WebElement locateElement(By by)
//		{
//			try {
//				return driver.findElement(by);
//			} catch (NoSuchElementException e) {
//				throw new NoSuchElementException("Element not found" + by.toString());
//			}
//		}
//		public void senddata(WebElement ele,String value) {
//			ele.sendKeys(value);
//		}
	
	}

