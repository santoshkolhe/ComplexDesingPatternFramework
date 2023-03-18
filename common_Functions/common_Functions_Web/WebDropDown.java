package common_Functions_Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDropDown {
	public static void selectByVisibleText(WebElement element, String text,ExtentTest logger) {
		if (WebElementCommon.isClickable(element)) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
			logger.log(LogStatus.PASS, text+ " Select succesfully.");
		}else{
			logger.log(LogStatus.PASS, text+ " Unable to select");
		}
		
	}
	public static void selectByValue(WebElement element, String text,ExtentTest logger) {
		if (WebElementCommon.isClickable(element)) {
			Select select = new Select(element);
			select.selectByValue(text);
			logger.log(LogStatus.PASS, text+ " Bed Select succesfully.");
		}else{
			   		
				logger.log(LogStatus.FAIL, text+ " Unable to Select Bed");
			}
		
	}
	public static void selectByIndex(WebElement element, int index,ExtentTest logger) {
		if (WebElementCommon.isClickable(element)) {
			Select select = new Select(element);
			select.selectByIndex(index);
			logger.log(LogStatus.PASS, index+ " Select succesfully.");
		}else{
			   		
				logger.log(LogStatus.FAIL, index+ " Unable to Select.");
			}
				
	}

	public static void selectByDropDown(WebElement element, String text,ExtentTest logger) {
		if (WebElementCommon.isClickable(element)) {
		Select value = new Select(element);
		value.selectByValue(text);
		logger.log(LogStatus.PASS, text+ " Select succesfully.");
	}else{
		   		
			logger.log(LogStatus.FAIL, text+ " Unable to Select.");
		}

	}

	public static void selectDropDownMultiple(List<WebElement> elements, String[] strVal, ExtentTest logger) {
		for (WebElement ele : elements) {
			if (ele.getText().equals(strVal)) {
				ele.click();
				logger.log(LogStatus.PASS, strVal+ " Select succesfully.");
			}
			else{
				logger.log(LogStatus.FAIL, strVal+ " Unable to Select.");
			}
		}
	}

	// Selecting searched dropdown in Selenium-WebDriver
	public static void selectSearchDropdown(WebDriver driver, By locator, String value) {
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(value);
		driver.findElement(locator).sendKeys(Keys.TAB);
	}

}
