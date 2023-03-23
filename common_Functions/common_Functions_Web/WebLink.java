package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebLink {
	public static void linkClick(WebElement link,ExtentTest logger) {
		
		link.click();
		logger.log(LogStatus.PASS, "Tab Clicked Succesfully.");
	}
	
	
}
