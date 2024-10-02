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

	public final By Gmail_Created = By.xpath("//span[text()='Create account']");
	public final By Gmail_typeofusage = By.xpath("//span[text()='For my personal use']");
	
	public final By pat_shop_AddBasket = By.xpath("//*[text()='Add to basket']");

	
}
