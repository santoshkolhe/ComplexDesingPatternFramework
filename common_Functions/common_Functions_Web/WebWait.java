package common_Functions_Web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWait {
	
	//by Fluent Wait
	public static WebElement webElementClickable(WebDriver driver, By by) {
		Wait<WebDriver> fluentWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		return fluentWait.until(ExpectedConditions.elementToBeClickable(by));
	}
   //by Fluent Wait
	public static WebElement webElementClickable(WebDriver driver, WebElement element) {
		Wait<WebDriver> fluentWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		return fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
    //by explicite Wait
	public static WebElement webElementClickable(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	//by explicite Wait
	public static WebElement webElementClickable(WebDriver driver, WebElement element, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//by explicite Wait
	public static WebElement webElementvisibilityOfElementLocated(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	//by Fluent Wait
	public static WebElement webElementVisibilityOfElementLocated(WebDriver driver, By by) {
		Wait<WebDriver> fluentWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
//*****************************************************************************************************************************************
	public static Boolean webElementelementToBeSelected(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.elementToBeSelected(by));
	}

	public static Boolean webElementelementSelectionStateToBe(WebDriver driver, By by, Boolean value,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.elementSelectionStateToBe(by, value));
	}

	public static Alert webalertIsPresent(WebDriver driver, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static Boolean webElementnumberOfWindowsToBe(WebDriver driver, int noofwindows, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.numberOfWindowsToBe(noofwindows));
	}

	public static WebElement webElementPresenceOfElementLocated(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static List<WebElement> webElementvisibilityOfAllElementLocatedBy(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	public static List<WebElement> webElementvisibilityOfAllElements(WebDriver driver, WebElement elements, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public static List<WebElement> webElementvisibilityOfAllElements(WebDriver driver, WebElement[] elements, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public static WebElement webElementvisibilityOf(WebDriver driver, WebElement element, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static List<WebElement> webElementPresenceOfAllElementsLocatedBy(WebDriver driver, By by,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}

	public static Boolean webElementtextToBe(WebDriver driver, By by, String value, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.textToBe(by, value));
	}

	public static List<WebElement> webElementNumberOfElementsToBe(WebDriver driver, By by, int no, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.numberOfElementsToBe(by, no));
	}

	public static List<WebElement> webElementNumberOfElementsToBeMoreThan(WebDriver driver, By by, int no,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, no));
	}

	public static List<WebElement> webElementNumberOfElementsToBeLessThan(WebDriver driver, By by, int no,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, no));
	}

	public static Boolean webElementDomPropertyToBe(WebDriver driver, WebElement element, String property, String value,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.domPropertyToBe(element, property, value));
	}

	public static Boolean webElementDomAttributeToBe(WebDriver driver, WebElement element, String attribute,
			String value, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.domAttributeToBe(element, attribute, value));
	}

	public static Boolean webElementTextToBePresentInElementLocated(WebDriver driver, By by, String txt,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(by, txt));
	}

	public static Boolean webElementTextToBePresentInElement(WebDriver driver, WebElement element, String txt,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.textToBePresentInElement(element, txt));
	}

	public static Boolean webElementTextToBePresentInElementValue(WebDriver driver, By by, String txt,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.textToBePresentInElementValue(by, txt));
	}

	public static Boolean webElementTextToBePresentInElementValue(WebDriver driver, WebElement element, String str,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.textToBePresentInElementValue(element, str));
	}

	public static WebDriver webElementFrameToBeAvailableAndSwitchToIt(WebDriver driver, String framename,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
	}

	public static WebDriver webElementFrameToBeAvailableAndSwitchToIt(WebDriver driver, int frameindex,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}

	public static WebDriver webElementFrameToBeAvailableAndSwitchToIt(WebDriver driver, By frame, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	}

	public static WebDriver webElementFrameToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public static Boolean webElementInvisibilityOfElementLocated(WebDriver driver, By by, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public static Boolean webElementInvisibilityOfElementWithText(WebDriver driver, By by, String txt,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.invisibilityOfElementWithText(by, txt));
	}

	public static Boolean webElementStalenessOf(WebDriver driver, WebElement element, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.stalenessOf(element));
	}

	public static Boolean webElementAttributeToBe(WebDriver driver, WebElement element, String attribute, String value,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}

	public static Boolean webElementAttributeContains(WebDriver driver, WebElement element, String attribute,
			String value, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.attributeContains(element, attribute, value));
	}

	public static Boolean webElementAttributeContains(WebDriver driver, By by, String attribute, String value,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.attributeContains(by, attribute, value));
	}

	public static Boolean webElementAttributeToBeNotEmpty(WebDriver driver, WebElement element, String attribute,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
	}

	public static List<WebElement> webElementVisibilityOfNestedElementsLocatedBy(WebDriver driver, By parent, By child,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(parent, child));
	}

	public static List<WebElement> webElementVisibilityOfNestedElementsLocatedBy(WebDriver driver, WebElement element,
			By child, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(element, child));
	}

	public static WebElement webElementpresenceOfNestedElementLocatedBy(WebDriver driver, By by, By child,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, child));
	}

	public static WebElement webElementpresenceOfNestedElementLocatedBy(WebDriver driver, WebElement element, By child,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, child));
	}

	public static List<WebElement> webElementPresenceOfNestedElementsLocatedBy(WebDriver driver, By parent, By child,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(parent, child));
	}

	public static Boolean webElementInvisibilityOfAllElements(WebDriver driver, WebElement elements,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
	}

	public static Boolean webElementInvisibilityOfAllElements(WebDriver driver, WebElement[] elements,
			Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
	}

	public static Boolean webElementInvisibilityOf(WebDriver driver, WebElement element, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static Boolean webElementTitleIs(WebDriver driver, String title, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.titleIs(title));
	}

	public static Boolean webElementJavaScriptThrowsNoExceptions(WebDriver driver, String jscript, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(jscript));
	}

	public static Object webElementJsReturnsValue(WebDriver driver, String jscript, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.jsReturnsValue(jscript));
	}

	public static Boolean webElementTitleContains(WebDriver driver, String title, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.titleContains(title));
	}

	public static Boolean webElementUrlToBe(WebDriver driver, String url, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.urlToBe(url));
	}

	public static Boolean webElementUrlContains(WebDriver driver, String str, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.urlContains(str));
	}

	public static Boolean webElementUrlMatches(WebDriver driver, String regexurl, Duration duration) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		return wait.until(ExpectedConditions.urlMatches(regexurl));
	}
	

}
