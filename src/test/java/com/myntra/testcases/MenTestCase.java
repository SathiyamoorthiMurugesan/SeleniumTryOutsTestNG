package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.base.Base;
import com.myntra.pages.CartPage;
import com.myntra.pages.HomePage;
import com.myntra.pages.MenTopWearPage;

public class MenTestCase extends Base{
	HomePage homePage  = new HomePage(driver);
	MenTopWearPage menTopWearPage;
	CartPage cartPage;
	
//	public MenTestCase() {
//		HomePage homePage = new HomePage(driver);	
//	}
	
	@Test
	public void AddMenShirtToCartAndVerifyCart() throws InterruptedException {
//		homePage = new HomePage(driver);
		homePage.clickMenTopWear();
//		menTopWearPage.chooseSize();
//		menTopWearPage.addTocard();
//		cartPage.verifyTshirtAdded();
	}

}
