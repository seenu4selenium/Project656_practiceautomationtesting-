package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {

	public final By fb_username = By.id("email");
	public final By fb_passwoed = By.name("pass");
	public final By fb_LoginButton = By.name("login");

	public final By pat_username = By.id("username");
	public final By pat_password = By.name("password");
	public final By pat_LoginButton = By.name("login");
	public final By pat_LogoutlinkText = By.linkText("Logout");

	public final By fb_UserName = By.id("email");
	public final By fb_Password = By.name("pass");
	public final By fb_Login = By.name("login");

	public final By automationpage_MyAccount = By.xpath("//a[text()='My Account']");
	public final By automationpage_Logout = By.xpath("//a[text()='Logout']");
	public final By automationpage_Registration = By.name("register");
	public final By automationpage_Email = By.name("email");
	public final By automationpage_Password = By.id("reg_password");
	public final By automationpage_Homepage = By.xpath("//a[text()='Shop']");
	public final By automationpage_products = By.xpath("//*[text()='Product Categories']");
	public final By automationpage_SelectProduct = By.xpath("//a[text()='Android']");
	


	public final By Gmail_Created = By.xpath("//span[text()='Create account']");
	public final By Gmail_typeofusage = By.xpath("//span[text()='For my personal use']");
	
	public final By pat_shop_AddBasket = By.xpath("//*[text()='Add to basket']");

	
	public final By automationpage_Addtocart = By.xpath("//*[text()='Add to basket']");
	public final By automationpage_Cartitems = By.xpath("//*[text()='1 item']");
	public final By automationpage_Checkout = By.xpath("//a[contains(text(), 'Proceed to Checkout')]");
	public final By automationpage_Firstname = By.id("billing_first_name");
	public final By automationpage_Lastname = By.id("billing_last_name");
	public final By automationpage_EmailId = By.id("billing_email");
	public final By automationpage_Phone = By.id("billing_phone"); 
	public final By automationpage_Billingaddr = By.id("billing_address_1");
	public final By automationpage_Billingcity = By.id("billing_city");
	public final By automationpage_Postcode = By.id("billing_postcode");
	public final By automationpage_Ordersubmission = By.id("place_order"); 
	public final By automationpage_Coupon = By.xpath("//a[@class='showcoupon']");
	public final By automationpage_Coupon_editbox = By.name("coupon_code");
	public final By automationpage_Apply = By.name("apply_coupon");
	
	public final By Pat_Addresses = By.xpath("//*[text()='Addresses']");
	
	public final By BillingAddressEdit = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[1]/header/a");
	public final By Pat_BillingAddress_FirstName1 = By.name("billing_first_name");
	public final By Pat_BillingAddress_LastName = By.name("billing_last_name");
	public final By Pat_CompanyName= By.name("billing_company");
	public final By PhoneNumber = By.name("billing_phone");
	public final By Address = By.name("billing_address_1");
	public final By CityName = By.name("billing_city");
	public final By PostalCode = By.name("billing_postcode");
	
	public final By Billing_SaveAddressButton = By.name("save_address");
	
	public final By AddShippingAddress = By.xpath("(//a[text()='Edit'])[2]");
	public final By ShippingAddress_FirstN = By.name("shipping_first_name");
	public final By ShippingAddress_LastN = By.name("shipping_last_name");
	public final By Shipping_Company = By.name("shipping_company");
	public final By ShippingAddress = By.name("shipping_address_1");
	public final By ShippingCity = By.name("shipping_city");
	public final By ShippingPostal = By.name("shipping_postcode");
	

	public final By Shipping_SaveAddressButton = By.name("save_address");
	
	public final By ShippingAddressEdit = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[2]/header/a");

	
	public final By Pat_LogoutLinkText = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a");
	
	public final By Pat_LoginUsername = By.name("username");
	public final By Pat_LoginPassword = By.name("password");
	public final By LoginButton = By.name("login");
	
	public final By Manage_ShipBill_AddressLink = By.linkText("shipping and billing addresses");
	
	
	
	
	}
