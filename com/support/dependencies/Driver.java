package com.support.dependencies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver
{
	private static WebDriver driver;
	
	public static WebDriver getDriver(String browserName){
		setDriver(browserName);
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	private static void setDriver(String browserName) {
		if(browserName == "Chrome") {
			driver= new ChromeDriver();
		}
	}
}
