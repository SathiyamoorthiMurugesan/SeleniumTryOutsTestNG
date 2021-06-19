package com.interview.selenium.questions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplainWebDriverDriver {
//	https://www.softwaretestingmaterial.com/webdriver-driver-new-firefoxdriver/
//	WebDriver driver = new ChromeDriver();
	
//	WebDriver - Its an interface
//	driver - reference variable
//	ChromeDriver() - constructor
//	new - keyword in java
//	new ChromeDriver() - is an object
	
//	Here we are creating object of ChromeDriver class by taking reference of WebDriver interface (Up casting driver).
//	If we create driver variable by referring webDriver interface, switching between browsers are easy. Helps in CrossBrowserTesting
		/*
		  	WebDriver driver = new FirefoxDriver();
			driver.quit();
			driver = new ChromeDriver();
		 */
//	If we create ChromeDriver() driver = new ChromeDriver(); Then this object works only on Chrome browser.
//	The above object can have WebDriver and RemoteDriver methods and only ChromeDriver class Specific methods.
//	We can not do WebDriver driver = new WebDriver(); We can not create instance for Interfaces.
	

/* In general, Web driver interface has different methods(get(), close(), quit(), navigateTo())
 * Those methods are implemented in RemoteWebDriver class.
 * Browsers such as ChromeDriver and Firefox has their own methods along with the implemented methods
 */
	
/* Selenium Hierarchy
 * SearchContext - Interface (List FindElements, WebElement findElement)
 * WebDriver - Interface - extends SearchContext (get(), close(), quit(), getTitle())
 * RemoteWebDriver - Class - implements WebDriver, JavaScripExecutor and TakeScreenShot (get(), close(), quit(), getTitle())
 * ChromeDriver, FirefoxDriver - classes - Extends RemoteWebDriver (multiple constructors and LaunchApp())
 * 
 * javaScriptExecutor - Interface - Implemented by RemoteWebDriver - has two methods 
 * 			Object executeScript(String script, Object... args);
 * 			 Object executeAsyncScript(String script, Object... args);
 * 
 * TakesScreenshot - Interface - Implemented by RemoteWebDriver class - has one method
 * 			  <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException;
 * 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
