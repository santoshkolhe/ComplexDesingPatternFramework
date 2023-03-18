package nursing_Page_Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebTextBox;
import nursing_Page_Locators.NursingDemoOne_Page_Locator;

public class NursingDemoOne_Page_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public NursingDemoOne_Page_Locator nersingDemoOnePL = null;
	
	public NursingDemoOne_Page_Action(WebDriver driver ,ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		nersingDemoOnePL = new NursingDemoOne_Page_Locator(driver);
	}
	
	public boolean validatePageTitle(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	
	public void enterUserName(String user){
		WebElement userName = nersingDemoOnePL.getUserName();
		WebTextBox.sendInput(userName, user, logger);
		//WebTextBox.sendInput(WebWait.webElementClickable(driver, userName),user, logger);
	}
	
	public void enterPassword(String pass){
		WebTextBox.sendInput(nersingDemoOnePL.getPassword(), pass, logger);
	}
	public void clickLogin(){
		WebTextBox.click(nersingDemoOnePL.clickLogin(), logger);
	}
	public void verifyPage(String verifyPage){
		WebBrowser.verify_Page(driver, verifyPage,logger);
	}
	
	public void nursingDemoProcess(String title, String user, String pass) {
		if(validatePageTitle(title)){
			enterUserName(user);
			enterPassword(pass);
			clickLogin();
			//verifyPage(verifyPage);
			
		}
		else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}

}
