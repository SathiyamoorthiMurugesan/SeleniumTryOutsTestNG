package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.base.Base;
import com.myntra.pages.CartPage;
import com.myntra.pages.HomePage;
import com.myntra.pages.MenTopWearPage;

public class MenTestCase extends Base{
	HomePage homePage;
	MenTopWearPage menTopWearPage;
	CartPage cartPage;
	
//	MenTestCase() {
//		HomePage homePage = new HomePage();
//	}
	
			
	@Test
	public void AddMenShirtToCartAndVerifyCart() throws InterruptedException {
//		HomePage homePage = new HomePage();
		homePage.clickMenTopWear();
//		menTopWearPage.chooseSize();
//		menTopWearPage.addTocard();
//		cartPage.verifyTshirtAdded();
	}

}
