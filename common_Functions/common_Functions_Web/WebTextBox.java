package common_Functions_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebTextBox {
	public static void sendInput(WebElement textBox, String text,ExtentTest logger){
		if(WebElementCommon.isClickable(textBox)){
			textBox.clear();
			textBox.sendKeys(text);
			logger.log(LogStatus.PASS, text+ " entered succesfully.");
			
		}else{
			logger.log(LogStatus.FAIL, text+ " not entered.");
		}
	}
	public static void clear(WebElement textBox){
		textBox.clear();
	}
	public static void click(WebElement locator,ExtentTest logger){
		if(WebElementCommon.isClickable(locator)){
			locator.click();
			logger.log(LogStatus.PASS,  "Next Button/Tab clicked successfully");
		}else{
			logger.log(LogStatus.FAIL,  "Next button/Tab is not Clickable.");
		}
		
	}

	//Inserting string in Text Field in Selenium-WebDriver
	public static void insertText(WebDriver driver, By locator, String value) {
			WebElement textBox = driver.findElement(locator);
			textBox.clear();
			textBox.sendKeys(value);
			}
	}

