package com.testscenarios;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class Srini_TS_04_GuestUSer extends CommonFunctions{
  @Test
  public void f() throws Exception {
	  chromeBrowserLaunch();
	 // getURL("shop_URL");
	//  scrollIntoView(loc.pat_shop_AddBasket);
	  //clickByAnyLocator(loc.pat_shop_AddBasket);
	  //clickUsingJavaScript(loc.pat_shop_AddBasket);
	
	  getURL("pat_url");
	  sendKeysByAnyLocator(loc.automationpage_Email, "pat_emailaddress");
	  // given locator is visible on current screen?
	  // given locator is enabled?
	  //if any existing data present, have to clear? did you clear that data?
	  //driver.findElement(loc.automationpage_Email).sendKeys("pat_emailaddress");
	  clickByAnyLocator(loc.automationpage_Registration);
	  sendKeysByAnyLocator(loc.automationpage_Password, "pat_password");
	  sendKeysByAnyLocator(loc.automationpage_Email, "automationpage_ValidEmail");
	 
  }
}
