package com.selenium.selenium3Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Zishan Paya
 * @date 13-03-2017
 * @version chromedriver v2.28
 */

public class Selenium3DemoChromeTest {
	String driverPath;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driverPath = System.getProperty("user.dir") + "/lib/chromedriver";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}

	@Test
	public void chromeTest() {
		driver.get("http://qalititude.blogspot.in");
		System.out.println("Web Page Title-: " + driver.getTitle());
		driver.quit();
	}

}
