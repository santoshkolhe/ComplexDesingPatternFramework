package common_Functions_Web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebAlert {
	public static void acceptAlert(Alert alert) {
		alert.accept();
	}

	public static void acceptAlert(WebDriver driver, ExtentTest logger) {
		
		driver.switchTo().alert().accept();
		System.out.println("Alert Handled successfully:");
		logger.log(LogStatus.PASS, "Tab Clicked Succesfully.");
	}

	public static void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	public static void cancelAlert(Alert alert) {
		alert.dismiss();
	}

	public static void inputAlert(WebDriver driver, String msgtext) {
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(msgtext);
		alert.accept();
	}
	// This function will fetch message on Pop-up
	public static String getPopupMessage(WebDriver driver, String sucessMsg,ExtentTest logger) {
		String message = null;
		try {
			Alert alert = driver.switchTo().alert();
			message = alert.getText();
			if(message.equals(sucessMsg)){
				alert.accept();
				System.out.println("Alert Handled successfully:");
            }
			System.out.println("Alert not Found");
 		} catch (Exception e) {
			message = null;
		}
		System.out.println("message" + message);
		return message;
	}

	// This function will Canceling pop-up in Selenium-WebDriver
	public static String cancelPopupMessageBox(WebDriver driver) {
		String message = null;
		try {
			Alert alert = driver.switchTo().alert();
			message = alert.getText();
			alert.dismiss();
		} catch (Exception e) {
			message = null;
		}
		return message;

	}

	// This function will Insert the value in the Alert TextBox.
	public static void promptSendKeys(WebDriver driver, String alertMsg) {
		// Click the link to activate the alert
		// driver.findElement(By.linkText("See a sample prompt")).click();
		// Wait for the alert to be displayed and store it in a variable
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		// Type your message
		alert.sendKeys(alertMsg);
		// Press the OK button
		alert.accept();

	}

}
