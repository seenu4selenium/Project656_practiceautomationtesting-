package com.testscenarios;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class TC1_Registration extends CommonFunctions {
	@Test
	public void tc_01() throws IOException, Exception {
		chromeBrowserLaunch();
		getURL("URL");
		driver.get(p.getProperty("URL"));
		Thread.sleep(1000);
		driver.findElement(loc.automationpage_MyAccount).click();

		// TC1.2 Click on Register button without fill any data, verify error message
		driver.findElement(loc.automationpage_Registration).click();

		// TC1.3 Click on Register button with invalid-test data, verify error message
		driver.findElement(loc.automationpage_Email).sendKeys(p.getProperty("automationpage_InvalidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(p.getProperty("automationpage_Password"));
		driver.findElement(loc.automationpage_Registration).click();
		driver.findElement(loc.automationpage_MyAccount).click();

		// TC1.4 Click on Register button with valid-test data, verify registration
		// successful message
		driver.findElement(loc.automationpage_Email).sendKeys(p.getProperty("automationpage_ValidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(p.getProperty("automationpage_Password"));
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(loc.automationpage_Registration).click();
		driver.findElement(loc.automationpage_Logout).click();

		// TC1.5 Verify user will able to register with existing email
		driver.findElement(loc.automationpage_Email).sendKeys(p.getProperty("automationpage_ValidEmail"));
		driver.findElement(loc.automationpage_Password).sendKeys(p.getProperty("automationpage_Password"));
		driver.findElement(loc.automationpage_Registration).click();

	}
}
