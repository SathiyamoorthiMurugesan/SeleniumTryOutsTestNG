package com.myntra.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver;
	@BeforeTest
	public void openBrower() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
	}
	
	public static void moveMouseToElement(WebElement ele) {
		Base base = new Base();
		Actions action = new Actions(base.driver);
		action.moveToElement(ele);
	}

}
