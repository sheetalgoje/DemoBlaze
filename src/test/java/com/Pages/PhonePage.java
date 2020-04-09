package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage {
	WebDriver driver;

	@FindBy(id = "itemc")
	WebElement item;

	@FindBy(className = "hrefch")
	WebElement samsung;

	@FindBy(linkText = "Add to cart")
	WebElement atc;

	// launch webdriver
	public PhonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// clicks on phonesection
	public void click_Phonesection() {
		item.click();
		// item.sendKeys(Keys.RETURN);
	}

	// clicks on selectedphones
	public void click_Selectedphone() {
		samsung.click();
	}

	// clicks on addtocart
	public void click_Cart() {
		atc.click();
	}

}
