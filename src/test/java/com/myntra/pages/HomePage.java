package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/shop/men']")
	WebElement MenShoppingPage;

	@FindBy(xpath = "//a[@href='/men-topwear']")
	WebElement MenTopWearPage;
	
	@FindBy(xpath="//a[@href='/shop/women']")
	WebElement WomenShoppingPage;
	
	@FindBy(xpath = "//a[@href='/fusion-wear']")
	WebElement WomenFusionWearPage;
	
	@FindBy(xpath = "//span[contains(text(),'Bag')]")
	WebElement CartPage;
	
	public void clickMenTopWear() throws InterruptedException {
//		Base.moveMouseToElement();
//		Actions action = new Actions(driver);
//		action.moveToElement(MenShoppingPage);
		MenShoppingPage.click();
		MenTopWearPage.click();
		wait(2000);
	}
	
	public void goToCartPage() throws InterruptedException {
		CartPage.click();
		wait(3000);
	}
}
