package common_Component;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebButton;
import dataSource.PropertyReader;

public class BaseClass {
	public static ExtentTest logger;
	public static ExtentReports graphicalReport;
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuiteStart(){
		//Knowledeware Report
		//graphicalReport = new ExtentReports("C:/MyWorkspace/Complex_Design_Pattern_Framework/Report/Knowledgeware/Knowledgeware.html", true);
		
		graphicalReport = new ExtentReports("C:/MyWorkspace/Complex_Design_Pattern_Framework/Report/NursingDemo/NursingDemo.html", true);
	}
	@BeforeMethod()
	public void beforeEachTest(Method testMethod) throws IOException{
		logger = graphicalReport.startTest(testMethod.getName());
		//driver = WebBrowser.getBrowserInstance(PropertyReader.getKeyValue("browser"));//Knowledeware
		driver = WebBrowser.getBrowserInstance(PropertyReader.get_Key_Value("browser"));//Nursing Demo
		//driver = WebBrowser.getBrowserInstance("firefox");
		//driver.get(PropertyReader.getKeyValue("url"));//Knowledeware
		driver.get(PropertyReader.get_Key_Value("url"));//Nursing Demo
		//driver.get("https://www.knowledgeware.in/final.html");
		driver.manage().window().maximize();
	}
	
	/*public void beforeEachTest(Method testMethod) throws IOException, InterruptedException{
		logger = graphicalReport.startTest(testMethod.getName());
		driver = WebBrowser.getBrowserInstance(PropertyReader.get_Key_Value("browser"));//for read data in property file
		//driver = WebBrowser.getBrowserInstance("firefox");
		driver.get(PropertyReader.get_Key_Value("url"));//for read data in property file
		//driver.get("https://www.knowledgeware.in/final.html");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
	}*/
	@AfterMethod
	public void afterEachTest(){
		graphicalReport.endTest(logger);
		graphicalReport.flush();
		//driver.close();
	}
	@DataProvider
	  public Object[][] registerPage1() {
	    return new Object[][] {
	    new Object[] {"Register page","SACHIN","P@ssw0rd","P@ssw0rd1234","Reg2","Prashant","Patil","21",
	    		"Dec","1980","santoshkolhe@gmail.com","8898765432","Male","Reg3",
	    		"Ramkrishna Chemburkar Marg","Chembur","400803","Maharashtra","India","Reg4","Dancing"},
	   // new Object[][] {{"Drawing"},{"Singing"},{"Dancing"}},
	    };
	}	    
	    
}	    
	  


