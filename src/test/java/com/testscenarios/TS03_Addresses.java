package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class TS03_Addresses extends CommonFunctions {
	@Test
	public void TS_03_18() throws Exception {

		// Locators loc = new Locators();
		// Properties prop = new Properties();
		chromeBrowserLaunch();
		// Create an object for Web driver Interface/class
		// WebDriver driver;

		// Open any browser
		// driver = new ChromeDriver();
		// To maximize window
		// driver.manage().window().maximize();
		// Read testdata from testdataproperties file
		// FileInputStream fi = new
		// FileInputStream("/Users/abhinavpadigela/git/Project656_practiceautomationtestingNew1/src/test/resources/testdata/QA_TestData.properties");
		// prop.load(fi);

		// Type URL
		//driver.get(p.getProperty("pat_url"));
		//
		//driver.findElement(loc.pat_username).sendKeys(p.getProperty("pat_emailaddress"));
		//driver.findElement(loc.pat_password).sendKeys(p.getProperty("pat_password"));
		//driver.findElement(loc.pat_LoginButton).click();
		getURL("pat_url");
		sendKeysByAnyLocator(loc.pat_username, "pat_emailaddress");
		sendKeysByAnyLocator(loc.pat_password, "pat_password");
		clickByAnyLocator(loc.pat_LoginButton);
		// driver.findElement(loc.pat_LogoutlinkText).click();
	}
	@Test
	public void TS_03_19() throws Exception {
		clickByAnyLocator(loc.Pat_Addresses);
		// Clickusingjavascript method is advanced when normal click does not work.
		// clickUsingJavaScript makes element visible and click on locator

	}
	@Test
	public void TS_03_20() throws Exception {
		// Adding Billing Address********//
		clickByAnyLocator(loc.BillingAddressEdit);
		sendKeysByAnyLocator(loc.Pat_BillingAddress_FirstName1, "Pat_BillingAddress_FirstName");
		sendKeysByAnyLocator(loc.Pat_BillingAddress_LastName, "Pat_BillingAddress_LastName");
		sendKeysByAnyLocator(loc.Pat_CompanyName, "Pat_CompanyName");
		sendKeysByAnyLocator(loc.PhoneNumber, "PhoneNumber");
		sendKeysByAnyLocator(loc.Address, "Address");
		sendKeysByAnyLocator(loc.CityName, "CityName");
		sendKeysByAnyLocator(loc.PostalCode, "PostalCode");
		clickUsingJavaScript(loc.Billing_SaveAddressButton);
		
	}
	@Test
	public void TS_03_21() throws Exception {
		// Click ADdresses Linktext to edit Existing Billing Address******//
		clickByAnyLocator(loc.Pat_Addresses);
		clickByAnyLocator(loc.BillingAddressEdit);
		sendKeysByAnyLocator(loc.PhoneNumber, "Updated_PH");
		clickUsingJavaScript(loc.Billing_SaveAddressButton);
	}
	@Test
	public void TS_03_22() throws Exception {
		//clickByAnyLocator(loc.Pat_Addresses);
		clickUsingJavaScript(loc.Pat_Addresses);
		clickByAnyLocator(loc.AddShippingAddress);
		sendKeysByAnyLocator(loc.ShippingAddress_FirstN, "Pat_ShippingAddress_FN");
		sendKeysByAnyLocator(loc.ShippingAddress_LastN, "Pat_ShippingAddress_LN");
		sendKeysByAnyLocator(loc.Shipping_Company, "Pat_ShippingCompanyName");
		sendKeysByAnyLocator(loc.ShippingAddress, "Address");
		sendKeysByAnyLocator(loc.ShippingCity, "ShippingCityName");
		sendKeysByAnyLocator(loc.ShippingPostal, "ShippingPostalCode");
		clickByAnyLocator(loc.Shipping_SaveAddressButton);

	}
	@Test
	public void TS_03_23() throws Exception {
		// Click ADdresses Linktext to edit Existing Shipping Address******//
		//clickByAnyLocator(loc.Pat_Addresses);
		clickUsingJavaScript(loc.Pat_Addresses);
		clickByAnyLocator(loc.ShippingAddressEdit);
		sendKeysByAnyLocator(loc.Shipping_Company, "Updated_CompanyName");
		clickUsingJavaScript(loc.Billing_SaveAddressButton);

	}
	@Test
	public void TS_03_24() throws Exception {
		// Logout Of the Account
		clickByAnyLocator(loc.pat_LogoutlinkText);
	}
	@Test
	public void TS_03_25() throws Exception {
		sendKeysByAnyLocator(loc.Pat_LoginUsername, "pat_emailaddress");
		sendKeysByAnyLocator(loc.pat_password, "pat_password");
		clickByAnyLocator(loc.LoginButton);

		clickByAnyLocator(loc.Manage_ShipBill_AddressLink);

	}

}