package com.interview.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;

	@BeforeTest
	public void launchBrower() {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void WebTableTestCases() {
		specificCellValueofTheGivenRow("S&P BSE 500", 1);
	}
	
	

	public void specificCellValueofTheGivenRow(String RowName, int ColumnNumber) {
		WebElement webTable = driver.findElement(By.xpath("//table[@id='dataTable']"));
		List<WebElement> allRows = webTable.findElements(By.tagName("tr"));
		int rowsCount = allRows.size();

		for (int i = 0; i < rowsCount; i++) {
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			int columnCount = allColumns.size();

			for (int j = 0; j < columnCount; j++) {

				if (allColumns.get(j).getText().equals(RowName)) {
					System.out.println(allColumns.get(ColumnNumber).getText());
				}
			}
		}
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.close();
	}

}
