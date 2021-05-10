package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.Base;

public class MenTopWearPage {

	WebDriver driver;
	
	public MenTopWearPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@href='tshirts/fido-dido/fido-dido-men-black-printed-polo-collar-slim-fit-t-shirt/2521204/buy']")
	WebElement FidoDioMensShirt;
	
	@FindBy(xpath="//p[@class='size-buttons-unified-size' and contains(text(),'L')]")
	WebElement shirtSizeL;
	
	@FindBy(xpath="//div[contains(text(),'ADD TO BAG')]")
	WebElement AddtoBag;
	
	public void chooseSize() throws InterruptedException {
		shirtSizeL.click();
		wait(2000);
	}
	
	public void addTocard() throws InterruptedException {
		AddtoBag.click();
		wait(3000);
	}
	
}
