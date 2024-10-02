package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class TS_04_GuestUser extends CommonFunctions {
	@Test
	public void TS04_1() throws Exception {
		chromeBrowserLaunch();
		getURL("URL");
		clickByAnyLocator(loc.automationpage_Homepage);

		// driver.findElement(loc.automationpage_Homepage).click();
		clickByAnyLocator(loc.automationpage_products);

	}

	@Test
	public void TS04_2() throws Exception {

		clickByAnyLocator(loc.automationpage_SelectProduct);
		// scrollIntoView(loc.automationpage_Addtocart);
		// Clickusingjavascript method is advanced when normal click does not work.
		// clickUsingJavaScript makes element visible and click on locator
		clickUsingJavaScript(loc.automationpage_Addtocart);

	}

	@Test
	public void TS04_3() throws Exception {

		clickByAnyLocator(loc.automationpage_Cartitems);
		clickUsingJavaScript(loc.automationpage_Checkout);

	}
	
	@Test
	public void TS04_4() throws Exception {
		
		sendKeysByAnyLocator(loc.automationpage_Firstname, "automationpage_FN");
		sendKeysByAnyLocator(loc.automationpage_Lastname, "automationpage_LN");
		clickUsingJavaScript(loc.automationpage_EmailId);
		sendKeysByAnyLocator(loc.automationpage_EmailId, "automationpage_EM");
	sendKeysByAnyLocator(loc.automationpage_Phone, "automationpage_PH");
	//	Thread.sleep(2000);
	//	clickByAnyLocator(loc.automationpage_Phone);
	//driver.findElement(loc.automationpage_Phone).sendKeys(p.getProperty("automationpage_PH"));
		sendKeysByAnyLocator(loc.automationpage_Billingaddr, "automationpage_ADDR");
		sendKeysByAnyLocator(loc.automationpage_Billingcity, "Automationpage_CITY");
		sendKeysByAnyLocator(loc.automationpage_Postcode, "Automationpage_PostCod");
		clickByAnyLocator(loc.automationpage_Ordersubmission);
	}
	
	@Test
	public void TS04_5() throws Exception {
		//clickByAnyLocator(loc.automationpage_Coupon);
		sendKeysByAnyLocator(loc.automationpage_Coupon, "automationpage_Coupon");
		clickByAnyLocator(loc.automationpage_Apply);
	}
	
	@Test
	public void TS04_6() throws Exception {
		
		clickByAnyLocator(loc.automationpage_Ordersubmission);
		
		
		
		
	}
	
}
