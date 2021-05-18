package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.base.Base;
import com.myntra.pages.CartPage;
import com.myntra.pages.HomePage;
import com.myntra.pages.MenTopWearPage;

public class WomenTestCase extends Base{
	HomePage homePage;
	MenTopWearPage menTopWearPage;
	CartPage cartPage;
	WomenTestCase womenTestCase;
	
				
	@Test
	public void AddMenShirtToCartAndVerifyCart() throws InterruptedException {
		MenTestCase.objectinitiation();
		homePage.clickMenTopWear();
//		menTopWearPage.chooseSize();
//		menTopWearPage.addTocard();
//		cartPage.verifyTshirtAdded();
	}

}
