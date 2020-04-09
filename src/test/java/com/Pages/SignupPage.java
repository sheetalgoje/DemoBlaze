package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	WebDriver driver;

	@FindBy(id = "signin2")
	WebElement signup;

	@FindBy(id = "sign-username")
	WebElement newusername;

	@FindBy(id = "sign-password")
	WebElement newpassword;

	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement btnSignup;

	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignDB() {
		signup.click();
	}

	public void setUserName(String uname) {
		newusername.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		newpassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnSignup.click();
	}
}
