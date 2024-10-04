package com.testscenarios;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class TS_02_LoginAndLogout extends CommonFunctions {
	@Test
	public void f() throws Exception {

		Locators loc = new Locators();
		Properties prop = new Properties();

		chromeBrowserLaunch();
		// Read testdata from testdataproperties file
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/testdata/QA_TestData.properties");
		prop.load(fi);

		// Type URL
		driver.get(prop.getProperty("pat_url"));
		takescreenshotOfCurrentPage("UrlOpened");
		driver.findElement(loc.pat_username).sendKeys(prop.getProperty("pat_emailaddress"));
		driver.findElement(loc.pat_password).sendKeys(prop.getProperty("pat_password"));
		driver.findElement(loc.pat_LoginButton).click();
		Thread.sleep(5000);
		takescreenshotOfCurrentPage("loginSuccess");
		driver.findElement(loc.pat_LogoutlinkText).click();
		Thread.sleep(5000);
		takescreenshotOfCurrentPage("logoutsuccess");

	}

}
