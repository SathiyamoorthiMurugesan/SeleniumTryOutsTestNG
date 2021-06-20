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
	WebElement webTable;

	@BeforeTest
	public void launchBrower() {
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webTable = driver.findElement(By.xpath("//table[@id='dataTable']"));
	}

	@Test
	public void WebTableTestCases() {
//		getSpecificCellValueofTheGivenRow("S&P BSE 500", 1);
//		getTotalRows();
//		getTotalColumns();
//		totalCells();
//		printAllCellValues();
//		printSpecifiedRowValues("S&P BSE Sensex 50");
//		getSpecifiedColumnValues(3);
//		getAllColumnsValue();
		getSpecifiedColumnValueByName("Change (Pts)");
	}
	
	public int getTotalRows() {
		List<WebElement> allRows = webTable.findElements(By.tagName("tr"));
		int rowsCount = allRows.size();
		System.out.println(rowsCount);
		return rowsCount;
	}
	
	public int getTotalColumns() {
		List<WebElement> allHeaders = webTable.findElements(By.tagName("th"));
		int columnCount = allHeaders.size();
		System.out.println(columnCount);
		return columnCount;
		
	}
	
	public void totalCells() {
		System.out.println(getTotalRows()*getTotalColumns());
	}
	
	public void printAllCellValues() {
		List<WebElement> allRows = webTable.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));

			for(WebElement each:allColumns)
				System.out.println(each.getText());
		}
	}
	
	public void printSpecifiedRowValues(String row) {
		driver.findElement(By.linkText("Show More >>")).click();
		String rowText =row;
		List<WebElement> RowsText = driver.findElements(By.xpath("//a[text() = '"+rowText+"']//parent::td//following-sibling::td"));
		for(WebElement each: RowsText) {
			System.out.println(each.getText());
		}
	}
	

	public void getSpecificCellValueofTheGivenRow(String RowName, int ColumnNumber) {
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
	
	public void getSpecifiedColumnValues(int columnNumber) {
		List<WebElement> specificColumn = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td["+columnNumber+"]"));
		for(WebElement each: specificColumn) {
			System.out.println(each.getText());
		}
	}
	
	public void getAllColumnsValue() {
		List<WebElement> AllColumnHeader = driver.findElements(By.tagName("th"));
		int columnCount = AllColumnHeader.size();
		for(int i=0;i<columnCount;i++) {
		List<WebElement> eachColumn = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td["+i+"]"));
		for(WebElement each: eachColumn) {
			System.out.println(each.getText());
		}
		}
	}
	
	public void getSpecifiedColumnValueByName(String columnHeader) {
		List<WebElement> AllColumnHeader = driver.findElements(By.tagName("th"));
		int columnCount = AllColumnHeader.size();
		for(int i=0;i<columnCount;i++) {
			if(AllColumnHeader.get(i).getText().equals(columnHeader)) {
				int temp = i+1;
				List<WebElement> eachColumn = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td["+temp+"]"));
				for(WebElement each: eachColumn) {
					System.out.println(each.getText());
				}
			}
		}
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.close();
	}

}
