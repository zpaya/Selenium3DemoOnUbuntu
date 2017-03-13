package com.selenium.selenium3Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Zishan Paya
 * @version 13-03-2017
 */

public class Selenium3DemoTest {
	String driverPath;
	WebDriver driver;
	
	@BeforeTest
	public void setup()	{
		driverPath = System.getProperty("user.dir")+"/lib/geckodriver";
		System.out.println(driverPath);
		System.setProperty("webdriver.gecko.driver", driverPath);
		//DesiredCapabilities dc = DesiredCapabilities.firefox();
		//dc.setBrowserName("firefox");
		//dc.setCapability("marionette", true);
		driver = new FirefoxDriver();
	}
	
	@Test
	public void seleniumTest()	{
		driver.get("http://qalititude.blogspot.in");
		System.out.println("Web Page Title-: "+driver.getTitle());
		driver.quit();
	}
	
	
}
