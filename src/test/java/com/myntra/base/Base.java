package com.myntra.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver;
	@BeforeSuite
	public static WebDriver openBrower() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		return driver;
		
	}
	
	public void moveMouseToElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele);
	}

}
