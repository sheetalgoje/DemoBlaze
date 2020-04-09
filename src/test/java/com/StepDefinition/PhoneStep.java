package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.Pages.PhonePage;
import com.SeliniumUtilil.UtilityDB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PhoneStep extends Library {
	PhonePage p;
	LoginPage l;
	UtilityDB util;
	final static Logger logger = LogManager.getLogger(PhoneStep.class.getName());

	@Given("^open the browser to open website$")
	public void open_the_browser_to_open_website() throws Throwable {
		launchApplication();
		logger.info("user launches the chrome browser");
	}

	@Given("^user opens the demoblaze and click on login$")
	public void user_opens_the_demoblaze_and_click_on_login() throws Throwable {
		LoginPage l = new LoginPage(driver);
		l.clickLoginDB();
		Thread.sleep(2000);
		logger.info("user clicks on the login button ");

	}

	@Given("^user enter the username  and password  and get login$")
	public void user_enter_the_username_and_password_and_get_login() throws Throwable {
		LoginPage l = new LoginPage(driver);
		l.setUserName("sheetal");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		l.setPassword("sheetal");
		l.clickSubmit();
		Thread.sleep(3000);
		logger.info("user enters username and password");

	}

	@Then("^user enters to mobile section$")
	public void user_enters_to_mobile_section() throws Throwable {
		PhonePage p = new PhonePage(driver);
		p.click_Phonesection();
		Thread.sleep(2000);
		logger.info("user click on the mobile section");

	}

	@Then("^user select the mobile and add the product to his/her cart$")
	public void user_select_the_mobile_and_add_the_product_to_his_her_cart() throws Throwable {
		PhonePage p = new PhonePage(driver);
		p.click_Selectedphone();
		Thread.sleep(2000);
		p.click_Cart();
		// p.WindowAlert();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		UtilityDB util = new UtilityDB(driver);
		util.takeSnapShot(
				"C:\\Users\\my pc\\eclipse-workspace1\\ProjectDemoBlaze\\src\\test\\resources\\Screenshot\\Mobile.png");
		System.out.println("ScreenShot taken");
		logger.info("user selects the mobile and add it to cart");

		driver.quit();
	}

}
