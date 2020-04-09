package com.SeliniumUtilil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilityDB {
	WebDriver driver;
	WebDriverWait wait;
	By Login = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
	
	public UtilityDB(WebDriver driver)
	{
		this.driver=driver;
	}
	public void takeSnapShot(String path1)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Source,new File(path1));
			//FileUtils.copyFile(Source, new File(path1));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void gettitle()
	{
		//driver.getTitle();
		System.out.println("Title of the page" + driver.getTitle());
	}
	public void Wait()
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Login)));
		
	}

}

