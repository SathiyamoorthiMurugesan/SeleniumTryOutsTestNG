package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.myntra.base.Base;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//div[contains(text(),'FIDO DIDO')]")
	WebElement FidoDido;
	
	public void verifyTshirtAdded() {
		Assert.assertTrue(FidoDido.isDisplayed());
	}

}
