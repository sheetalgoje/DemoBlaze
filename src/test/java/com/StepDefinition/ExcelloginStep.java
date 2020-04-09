package com.StepDefinition;

import com.BaseClass.Library;
import com.ExcelUtility.Excelutil;
import com.Pages.ExcelloginPage;
import com.SeliniumUtilil.UtilityDB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelloginStep extends Library {
	ExcelloginPage elp;
	Excelutil excel;
	UtilityDB util;

	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() throws Throwable {
		launchApplication();
	}

	@When("^demoblaze opens$")
	public void demoblaze_opens() throws Throwable {
		elp = new ExcelloginPage(driver);
		elp.clickLoginDB();

	}

	@Then("^ENters the email and password$")
	public void enters_the_email_and_password() throws Throwable {
		elp = new ExcelloginPage(driver);
		excel = new Excelutil();
		elp.setUserName(excel.excel_username(1));
		elp.setPassword(excel.excel_password(1));
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		excel = new Excelutil();
		elp = new ExcelloginPage(driver);
		elp.clickSubmit();

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		excel = new Excelutil();
		elp = new ExcelloginPage(driver);
		Thread.sleep(3000);
		elp.clickLogout();
		Thread.sleep(2000);
		driver.quit();
	}

}
