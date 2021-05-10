package pdf;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TestPDF {
	WebDriver driver;
	public void openBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://www.pdf995.com/samples/pdf.pdf");
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Downloads\\testPDF.pdf");
		PDDocument pdfDoc = PDDocument.load(fis);
		PDFTextStripper seperateText = new PDFTextStripper();
		String pdfContent = seperateText.getText(pdfDoc);
		System.out.println(pdfContent);
		
		Assert.assertTrue(pdfContent.contains("Please visit us at www.pdf995.com to learn more."));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
