package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.Pages.LoptopPage;
import com.SeliniumUtilil.UtilityDB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopStep extends Library {

	LoptopPage lap;
	LoginPage log;
	UtilityDB util;
	final static Logger logger = LogManager.getLogger(LaptopStep.class.getName());

	@Given("^that user Launche and open the site$")
	public void that_user_Launche_and_open_the_site() throws Throwable {
		launchApplication();
		LoginPage log = new LoginPage(driver);
		log.clickLoginDB();
		logger.info("user clicks on the login form ");
	}

	@When("^user Logins to website and enters usernm and paswrd$")
	public void user_Logins_to_website_and_enters_usernm_and_paswrd() throws Throwable {
		log = new LoginPage(driver);
		Thread.sleep(2000);
		log.setUserName("sheetal");
		Thread.sleep(2000);
		log.setPassword("sheetal");
		Thread.sleep(2000);
		log.clickSubmit();
		logger.info("username and password are entered bu user");
	}

	@Then("^clicks on laptop and select user desired laptop$")
	public void clicks_on_laptop_and_select_user_desired_laptop() throws Throwable {
		lap = new LoptopPage(driver);
		Thread.sleep(2000);
		lap.click_laptopSection();
		Thread.sleep(2000);
		lap.click_selectedLappy();
		Thread.sleep(2000);
		logger.info("user click on laptop section and selects desired laptop");
	}

	@Then("^add it cart and displays in cart$")
	public void add_it_cart_and_displays_in_cart() throws Throwable {
		lap = new LoptopPage(driver);
		Thread.sleep(2000);
		lap.click_addtocart();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		lap.click_cartl();
		util = new UtilityDB(driver);
		util.takeSnapShot(
				"C:\\Users\\my pc\\eclipse-workspace1\\ProjectDemoBlaze\\src\\test\\resources\\Screenshot\\Laptop.png");
		System.out.println("ScreenShot taken");
		logger.info("Laptop clicks on add to cart");
		driver.quit();
	}

}
