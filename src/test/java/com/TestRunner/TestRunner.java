package com.TestRunner;




import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//DemoBlaze.feature",
plugin = {"pretty", "html:target/cucumber-html-report",
		  "json:target/cucumber-json-report",
		  "junit:target/cucumber-junit-report",
		  "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html" },
tags = {" @tc_01_login,@tc_02_phonesection, @tc_03_laptopsection, @tc_04_register,@tc_05_excellogin"},
glue = {"com.StepDefinition"}, 
monochrome = true		
)

public class TestRunner {
	@AfterClass
	public static void extentreport() {
		Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent-config");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("sample test runner output message");
	}

}
