package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoptopPage {

	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement lapp;

	@FindBy(xpath = "//a[contains(text(),'Sony vaio i5')]")
	WebElement sony;

	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement atclap;
	
	@FindBy(xpath = "//a[@id='cartur']")
	WebElement cart;

	public LoptopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// user clicks on laptop section
	public void click_laptopSection() {
		lapp.click();
	}

	// user clicks on selected laptop
	public void click_selectedLappy() {
		sony.click();
	}

	// user clicks on add to cart
	public void click_addtocart() {
		atclap.click();
	}
	
	public void click_cartl() {
		cart.click();
	}
}
