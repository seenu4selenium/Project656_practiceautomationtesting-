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
	public final By automationpage_dropdown = By.xpath("//g[@class='down']");
	public final By filterLocator = By.xpath("//filter[@id='dropShadowTop']");

	public final By automationpage_Addtocart = By.xpath("//a[text()='Add to basket']");
	

	}
