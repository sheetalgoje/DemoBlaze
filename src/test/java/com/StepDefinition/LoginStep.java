package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.SeliniumUtilil.UtilityDB;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep extends Library {

	LoginPage log;
	UtilityDB util;
	final static Logger logger = LogManager.getLogger(LoginStep.class.getName());

	@Given("^user launches the chrome browser$")
	public void user_launches_the_chrome_browser() throws Throwable {
		launchApplication();
	}

	@Given("^user enters the url and opens the Login link$")
	public void user_enters_the_url_and_opens_the_Login_link() throws InterruptedException // throws Throwable
	{
		Thread.sleep(2000);
		LoginPage log = new LoginPage(driver);
		log.clickLoginDB();
		logger.info("user opens the demo blaze and clicks on the login ");
	}

	@Then("^user gives his username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_gives_his_username_and_password(String uname, String pwd) throws Throwable {
		LoginPage log = new LoginPage(driver);
		Thread.sleep(2000);
		log.setUserName(uname);
		Thread.sleep(2000);
		log.setPassword(pwd);
		logger.info("user enters username and password");
	}

	@Then("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		log = new LoginPage(driver);
		Thread.sleep(2000);
		logger.info("user clicks on the login button");

	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		log = new LoginPage(driver);
		log.clickSubmit();
		Thread.sleep(3000);
		util = new UtilityDB(driver);
		util.takeSnapShot("C:\\Users\\my pc\\eclipse-workspace1\\ProjectDemoBlaze\\src\\test\\resources\\Screenshot\\Login.png");
		System.out.println("ScreenShot taken");
		//log.clickLogout();
		Thread.sleep(2000);
		
		driver.quit();
		logger.info("user clicks on logout ");

	}

}
