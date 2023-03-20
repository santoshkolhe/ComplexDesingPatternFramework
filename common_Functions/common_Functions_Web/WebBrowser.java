package common_Functions_Web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBrowser {
	public static boolean titleVerification(WebDriver driver, String expTitle, ExtentTest logger) {
		boolean titleMatch = false;
		if (driver.getTitle().equals(expTitle)) {
			titleMatch = true;
			logger.log(LogStatus.PASS, expTitle+ " Title Matched succesfully.");
		
			
		}else{
		logger.log(LogStatus.FAIL, expTitle+ " Title not Matched");
		}
		return titleMatch;
	}

	public static void verify_Page(WebDriver driver, String expTitle, ExtentTest logger) {
		//boolean titleMatch = false;
		if (driver.getTitle().equals(expTitle)) {
			//titleMatch = true;
			//Assert.assertEquals("getTitle()", "expTitle");
			logger.log(LogStatus.PASS, expTitle+ " Title Matched succesfully.");
		
			
		}
		else{
		logger.log(LogStatus.FAIL, expTitle+ " Title not Matched");
		}
		//return titleMatch;
	}
	public static void setSize(WebDriver driver, int height, int width) {
		Dimension dimention = new Dimension(height, width);
		driver.manage().window().setSize(dimention);
	}

	public static Dimension getSize(WebDriver driver) {
		Dimension d = driver.manage().window().getSize();
		return d;

	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();

	}

	public static void openTab(WebDriver driver) {
		driver.switchTo().newWindow(WindowType.TAB);

	}

	public static void openNewWindow(WebDriver driver) {
		driver.switchTo().newWindow(WindowType.WINDOW);

	}

	public static WebDriver getBrowserInstance(String browserName){
		WebDriver driver=null;
		//WebDriverManager.chromedriver().setup();
		switch (browserName){
		
		case"chrome":
			//Options.addArguments("--remote-allow-origins=*");
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			driver=new ChromeDriver();
			break;
			
		case"firefox":
		    driver=new FirefoxDriver();
		break;
		
	   case"safari":
		    driver=new SafariDriver();
	    break;
	    
	   case"edge":
		    driver=new EdgeDriver();
		break;
	
       default:
            driver=new ChromeDriver();
        break;
       }
		return driver;
	}
}
