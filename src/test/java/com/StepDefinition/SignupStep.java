package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.Library;
import com.Pages.SignupPage;
import com.SeliniumUtilil.UtilityDB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupStep extends Library {
	SignupPage sign;
	UtilityDB util;
	final static Logger logger = LogManager.getLogger(SignupStep.class.getName());

	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		launchApplication();
		SignupPage sign = new SignupPage(driver);
		sign.clickSignDB();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("user launches the browser ");
	}

	@When("^user want to buy products and tap on signup$")
	public void user_want_to_buy_products_and_tap_on_signup() throws Throwable {
		SignupPage sign = new SignupPage(driver);
		sign.setUserName("ved");
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		sign.setPassword("ved");
		logger.info("user clicks on the signup button");
	}

	@Then("^registeres by entering new user and password$")
	public void registeres_by_entering_new_user_and_password() throws Throwable {
		sign = new SignupPage(driver);
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		sign.clickSubmit();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		util = new UtilityDB(driver);
		util.takeSnapShot(
				"C:\\Users\\my pc\\eclipse-workspace1\\ProjectDemoBlaze\\src\\test\\resources\\Screenshot\\Signup.png");
		System.out.println("ScreenShot taken");
		logger.info("user registers in the website succesfully");
		driver.quit();
	}

}
