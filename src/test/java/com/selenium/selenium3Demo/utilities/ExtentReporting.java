package com.selenium.selenium3Demo.utilities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReporting {

	public static ExtentReports extent; //("/dubizzle/src/test/com/dubizzle/resources/ReportHTML", true);
	public static ExtentTest test;
	
	public void reportOutput(String path)	{
		extent = new ExtentReports(path+"/ReportHTML", true);
		extent.loadConfig(new File(path+"/config/extent-config.xml"));
	}
	
	public void setAuthor(String author)	{
		
	}
	
}
