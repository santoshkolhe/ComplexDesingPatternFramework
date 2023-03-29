package knowledgeware_Page_Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebTextBox;
import common_Functions_Web.WebWait;
import knowledgeware_Page_Locators.RegisterOne_Page_Locator;

public class RegisterOne_Page_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public RegisterOne_Page_Locator regOnePL = null;
	
	public RegisterOne_Page_Action(WebDriver driver, ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		regOnePL = new RegisterOne_Page_Locator(driver);
	}
	
	public boolean validatePageTitle(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	
	public void enterUserName(String user){
		//WebElement userName = regOnePL.getUserName();
		//WebTextBox.sendInput(userName, user, logger);
		
		WebTextBox.sendInput(WebWait.webElementClickable(driver, regOnePL.getUserName(),Duration.ofSeconds(10)),user, logger);
		
	}
	
	public void enterPassword(String pass){
		//WebTextBox.sendInput(regOnePL.getPassword(), pass, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, regOnePL.getPassword(),Duration.ofSeconds(10)),pass, logger);
	}
	
	public void enterConfPass(String confPass){
	//	WebTextBox.sendInput(regOnePL.getConfirmPassword(), confPass, logger);
		WebTextBox.sendInput(WebWait.webElementClickable(driver, regOnePL.getConfirmPassword(),Duration.ofSeconds(10)),confPass, logger);
	}
	public void clkLogin(){
		WebTextBox.click(regOnePL.clkLogin(), logger);
	}
	
	public void registrationProcess(String title, String user, String pass, String confPass) {
		if(validatePageTitle(title)){
			enterUserName(user);
			enterPassword(pass);
			enterConfPass(confPass);
			clkLogin();
			
		}else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}

}
