package common_Component;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebBrowser;

import dataSource.PropertyReader;
import nursing_Page_Actions.NursingDemoOne_Page_Action;

public class BaseClass {
	public static ExtentTest logger;
	public static ExtentReports graphicalReport;
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuiteStart(){
		//Knowledeware Report
		//graphicalReport = new ExtentReports("C:/MyWorkspace/Complex_Design_Pattern_Framework/Report/Knowledgeware/Knowledgeware"+timestamp+".html", true);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		graphicalReport = new ExtentReports("C:/MyWorkspace/Complex_Design_Pattern_Framework/Report/NursingDemo/NursingDemo"+timestamp+".html", true);
	}
	@BeforeMethod()
	public void beforeEachTest(Method testMethod) throws IOException{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    driver =new ChromeDriver(co);
		logger = graphicalReport.startTest(testMethod.getName());
		//driver = WebBrowser.getBrowserInstance(PropertyReader.getKeyValue("browser"));//Knowledeware
		//driver = WebBrowser.getBrowserInstance(PropertyReader.get_Key_Value("browser"));//Nursing Demo
		//driver = WebBrowser.getBrowserInstance("firefox");
		//driver.get(PropertyReader.getKeyValue("url"));//Knowledeware
		driver.get(PropertyReader.get_Key_Value("url"));//Nursing Demo
		//driver.get("https://www.knowledgeware.in/final.html");
		driver.manage().window().maximize();
		NursingDemoOne_Page_Action nursingOnePA = new NursingDemoOne_Page_Action(driver, logger);
		nursingOnePA.nursingDemoProcess(
				PropertyReader.get_Key_Value("pageOneTitle"), 
				PropertyReader.get_Key_Value("user"),
				PropertyReader.get_Key_Value("pass"));
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
	//@DataProvider
	  public Object[][] registerPage1() {
	    return new Object[][] {
	    new Object[] {"Register page","SACHIN","P@ssw0rd","P@ssw0rd1234","Reg2","Prashant","Patil","21",
	    		"Dec","1980","santoshkolhe@gmail.com","8898765432","Male","Reg3",
	    		"Ramkrishna Chemburkar Marg","Chembur","400803","Maharashtra","India","Reg4","Dancing"},
	   // new Object[][] {{"Drawing"},{"Singing"},{"Dancing"}},
	    };
	}	
	@DataProvider
	  public Object[][] NursingDemo() {
	    return new Object[][] {
	    new Object[] {"MAA LALITA HOSPITAL & RESEARCH CENTRE - Dashboard","867354","Virat Kohli","Male","30","10/10/1999","Male","Hindu","Indian","Vilas","Friend","Single","5467890876","8763456778","Kurla Mumbai","Thane"
	    		,"400454","Kurla Police Station","Kurla post office","80","5.9'","125","80","45","H1_N1","FUTURE GENERALI INDIA INSURANCE CO LTD","General","IN-12345","SP32435","10/10/2022","Dr Tambe","DR S K SINGH","Normal","5678902","GW 04 - GENERAL WARD"},
	    new Object[] {"MAA LALITA HOSPITAL & RESEARCH CENTRE - Dashboard","99999","M.S.Dhoni","Male","35","10/10/1989","Male","Hindu","Indian","Nilesh","Friend","Single","2345678909","8763456778","Vashi Navi Mumbai","Thane"
    		,"400454","Vashi Police Station","Vashi post office","80","5.9'","125","80","45","H1_N1","FUTURE GENERALI INDIA INSURANCE CO LTD","General","IN-12345","SP32435","10/11/2022","Dr Pathak","DR S K SINGH","Normal","5678902","GW 04 - GENERAL WARD"},
	  	    };
	}	
	    
}	    
	  


