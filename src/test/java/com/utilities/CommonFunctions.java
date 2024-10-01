package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.objectrepository.Locators;

public class CommonFunctions {

	public static WebDriver driver;
	public Locators loc = new Locators();
	public Properties p = new Properties();
	public FileInputStream fi;

	// Get the Project path(projectDir)
	public String projectDir = System.getProperty("user.dir");
	public String propertyFile = "QA_TestData.properties";

	/********************** Browser launch ******************************/
	public void chromeBrowserLaunch() {
//		WebDriverManager.chromedriver().browserVersion("85").setup();
		driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("windows maximized");
	}

	public void firefoxBrowserLaunch() {
		driver = new FirefoxDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("windows maximized");
	}

	public void edgeBrowserLaunch() {
		driver = new EdgeDriver();
		driver.navigate().refresh();
	}

	public void getURL(String URL) throws IOException {
		fi = new FileInputStream(projectDir + "\\src\\test\\resources\\testdata\\" + propertyFile);
		p.load(fi);
		driver.get(p.getProperty(URL));
	}

	/*******
	 * Click
	 * 
	 * @throws Exception
	 ************************/
	public void clickByAnyLocator(By locator) throws Exception {
		implicitWait(10);
		WebElement element = driver.findElement(locator);
		// Check your locator is displayed?
		if (driver.findElements(locator).size() > 0) {
			// Check your element is in enable state?
			if (element.isEnabled()) {
				// Click on Button/radiobutton/checkbox/Link...
				highlightElement(element);
				element.click();
			} else {
				System.out.println("Given locator is not enable state on DOM(Current page***");
			}
		} else {
			System.out.println("Given locator is not displayed on DOM(Current page***");
		}
	}

	/************ waits in selenium ***********************/

	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("Implicit wait method used***");
	}

	/********* Get the Text From WebElement ***************/
	public String getTextFromElement(By locator) {
		String text = null;
		try {
			if (driver.findElements(locator).size() > 0) {
				// WebElement element = driver.findElement(locator);
				text = driver.findElement(locator).getText();
				System.out.println("Element Text is: " + text);

			} else {
				System.out.println("Element not present !");
			}
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
		return text;
	}

	// Get data from property file and verify Webelement Text
	public void verifyTextToBePresent(By locator, String expectedresults) throws Exception {
		WebElement ele = driver.findElement(locator);
		implicitWait(5);
		highlightElement(ele);
		String eleText = ele.getText();
		fi = new FileInputStream(".\\src\\test\\resources\\testdata\\" + propertyFile);
		p.load(fi);
		if (eleText.equals(p.getProperty(expectedresults))) {
			System.out.println("expected text presented on screen");
		} else if (eleText.contains(expectedresults)) {
			System.out.println("expected text contains  on screen");
		} else {
			System.out.println("expected text not presented on screen");
		}
	}

	/******** highlight the current execution Element ************/
	public void highlightElement(WebElement element) throws InterruptedException {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.border='7px solid red'", element);
			Thread.sleep(200);
			executor.executeScript("arguments[0].style.border='7px groove green'", element);
		} catch (Exception e) {
			System.out.println("Exception - " + e.getMessage());
		}
	}
}
