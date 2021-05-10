package com.myntra.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myntra.pages.CartPage;
import com.myntra.pages.HomePage;
import com.myntra.pages.MenTopWearPage;

public class MenTestCase {
	WebDriver driver;
	HomePage homePage;
	MenTopWearPage menTopWearPage;
	CartPage cardPage;
	
	public MenTestCase() {
		homePage = PageFactory.initElements(driver, HomePage.class);
		menTopWearPage = PageFactory.initElements(driver, MenTopWearPage.class);
		cardPage = PageFactory.initElements(driver, CartPage.class);
	}
	
	@Test
	public void AddMenShirtToCartAndVerifyCart() throws InterruptedException {
		homePage.clickMenTopWear();
		menTopWearPage.chooseSize();
		menTopWearPage.addTocard();
		cardPage.verifyTshirtAdded();
	}

}
