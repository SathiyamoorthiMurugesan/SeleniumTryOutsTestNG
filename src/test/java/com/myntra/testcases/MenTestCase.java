package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.base.Base;
import com.myntra.pages.CartPage;
import com.myntra.pages.HomePage;
import com.myntra.pages.MenTopWearPage;

public class MenTestCase extends Base{
	static HomePage homePage;
	static MenTopWearPage menTopWearPage;
	static CartPage cartPage;
	
	public static void objectinitiation() {
		homePage = new HomePage();	
	}
	
			
	@Test
	public void AddMenShirtToCartAndVerifyCart() throws InterruptedException {
		objectinitiation();
		homePage.clickMenTopWear();
//		menTopWearPage.chooseSize();
//		menTopWearPage.addTocard();
//		cartPage.verifyTshirtAdded();
	}

}
