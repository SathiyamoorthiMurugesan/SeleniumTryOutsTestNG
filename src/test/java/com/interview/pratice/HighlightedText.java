package com.interview.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\git\\VMProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
	WebElement element=	driver.findElement(By.xpath("//table/tbody/tr/th[text()='Company']"));
	String clr = element.getCssValue("color");
	System.out.println("print the colour of the text:"+clr);
	String backclr = element.getCssValue("background-color");
	System.out.println("print the colour of the text:"+backclr);
	String bold = element.getCssValue("font-weight");
	System.out.println("print the colour of the text:"+bold);
	WebElement element1=driver.findElement(By.xpath("//table/tbody/tr/td[text()='Germany']"));
	String clr1 = element1.getCssValue("color");
	System.out.println("print the colour of the text:"+clr1);
	String backclr1 = element1.getCssValue("background-color");
	System.out.println("print the colour of the text:"+backclr1);
	String bold1 = element1.getCssValue("font-weight");
	System.out.println("print the colour of the text:"+bold1);

	WebElement higlightedEle = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//following-sibling::a[text()='Try it Yourself »']"));
	String clr3 = higlightedEle.getCssValue("color");
	System.out.println("print the colour of the text:"+clr3);
	String backclr3 = higlightedEle.getCssValue("background-color");
	System.out.println("print the colour of the text:"+backclr3);
	String bold3 = higlightedEle.getCssValue("font-weight");
	System.out.println("print the colour of the text:"+bold3);
	System.out.println("added for testing");
	}

}
