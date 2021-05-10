package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
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
		Actions action = new Actions(driver);
		action.moveToElement(MenShoppingPage);
		wait(2000);
		MenTopWearPage.click();
		wait(2000);
	}
	
	public void goToCartPage() throws InterruptedException {
		CartPage.click();
		wait(3000);
	}
}
