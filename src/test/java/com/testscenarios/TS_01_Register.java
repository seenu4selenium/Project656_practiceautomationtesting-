package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class TS_01_Register {

	// create object for locator class
	// Classname anyObjectName = new Classname();

	Locators loc = new Locators();
	Properties prop = new Properties();

	@Test
	public void f() throws Exception {

		// TC01 Registration page with out any data
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Read test data from properties file
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/testdata/QA_TestData.properties");
		prop.load(fi);

		// TC1.1 Application should open register & login webpages
		driver.get(prop.getProperty("reg_URL"));
		Thread.sleep(1000);
		driver.findElement(loc.automationpage_MyAccount).click();

		// TC1.2 Click on Register button without fill any data, verify error message
		driver.findElement(loc.automationpage_Registration).click();

		// TC1.3 Click on Register button with invalid-test data, verify error message
		driver.findElement(loc.automationpage_Email).sendKeys(prop.getProperty("automationpage_InvalidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(prop.getProperty("automationpage_Password"));
		driver.findElement(loc.automationpage_Registration).click();
		driver.findElement(loc.automationpage_MyAccount).click();

		// TC1.4 Click on Register button with valid-test data, verify registration
		// successful message
		driver.findElement(loc.automationpage_Email).sendKeys(prop.getProperty("automationpage_ValidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(prop.getProperty("automationpage_Password"));
		driver.findElement(loc.automationpage_Registration).click();
		driver.findElement(loc.automationpage_Logout).click();

		// TC1.5 Verify user will able to register with existing email
		driver.findElement(loc.automationpage_Email).sendKeys(prop.getProperty("automationpage_ValidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(prop.getProperty("automationpage_Password"));
		driver.findElement(loc.automationpage_Registration).click();

	}
}
