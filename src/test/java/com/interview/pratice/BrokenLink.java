package src.test.java.com.interview.pratice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String url ="";
		int respCode =200;
		HttpURLConnection huc;
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.w3schools.com/html/");
     
     List<WebElement> urlEle = driver.findElements(By.xpath("//span[text()='HTML']/parent::h2//following-sibling::a[contains(text(),'HTML') and @target='_top']"));
	
	for(WebElement e: urlEle) {
		 url = e.getAttribute("href");
		 
		huc = (HttpURLConnection) (new URL(url).openConnection()); 
	 huc.setRequestMethod("HEAD");
	 huc.connect();
	 
	 respCode = huc.getResponseCode();
	 
	 if(respCode >=400) {
		 System.out.println("The following link: "+url+" is a broken link");
	 }
		 else {
			 System.out.println("The following link: "+url+" is a valid link");
		 }
	 }
	}
	}


