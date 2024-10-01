package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class TS_02_LoginAndLogout {
	@Test
	public void f() throws Exception {

		Locators loc = new Locators();
		Properties prop = new Properties();

		// Create an object for Web driver Interface/class
		WebDriver driver;

		// Open any browser
		driver = new ChromeDriver();
		// To maximize window
		driver.manage().window().maximize();
		// Read testdata from testdataproperties file
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/testdata/QA_TestData.properties");
		prop.load(fi);

		// Type URL
		driver.get(prop.getProperty("pat_url"));
		driver.findElement(loc.pat_username).sendKeys(prop.getProperty("pat_emailaddress"));
		driver.findElement(loc.pat_password).sendKeys(prop.getProperty("pat_password"));
		driver.findElement(loc.pat_LoginButton).click();

		driver.findElement(loc.pat_LogoutlinkText).click();
	}
}
