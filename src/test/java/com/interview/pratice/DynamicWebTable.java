package com.interview.pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamil\\git\\VMProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th"));
		for(WebElement e:headers) {
			count++;
			if(e.getText().equalsIgnoreCase("Country")) {
				break;
			}
		}
		
		System.out.println("Print the Country index:"+count);
		String company = "Island Trading";
		WebElement countryEle = driver.findElement(By.xpath("//td[text()='"+company+"']/following-sibling::td["+(count-1)+"]"));
		String countryName = countryEle.getText();
		System.out.println("Country is:"+countryName);
		
	}

}
