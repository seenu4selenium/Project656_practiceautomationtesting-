package com.testscenarios;


import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class TS_04_GuestUser extends CommonFunctions {
	@Test
	public void TS04_1() throws Exception {
		chromeBrowserLaunch();
		getURL("URL");
		driver.get(p.getProperty("URL"));
		Thread.sleep(1000);

		driver.findElement(loc.automationpage_Homepage).click();
		clickByAnyLocator(loc.automationpage_products);

	}

	@Test
	public void TS04_2() throws Exception {
		Thread.sleep(1000);
		driver.findElement(loc.automationpage_SelectProduct).click();
		
		Thread.sleep(3000);
		driver.findElement(loc.filterLocator).click();
		
		driver.findElement(loc.automationpage_Addtocart).click();

	}
}
