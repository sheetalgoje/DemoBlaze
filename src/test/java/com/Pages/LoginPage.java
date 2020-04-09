package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "login2")
	WebElement lnkLogin;

	@FindBy(id = "loginusername")
	WebElement txtUserName;

	@FindBy(id = "loginpassword")
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement btnLogin;

	//@FindBy(id = "logout2")
	//WebElement lnkLogOut;

	// launching webdriver
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// user clicks on login
	public void clickLoginDB() {
		lnkLogin.click();
	}

	// user enters username
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	// user enters password
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	// user clicks on submit
	public void clickSubmit() {
		btnLogin.click();
	}

	// user logout of the page
	//public void clickLogout() {
		//lnkLogOut.click();
	//}

}
