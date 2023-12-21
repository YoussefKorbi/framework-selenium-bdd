package com.e2eTests.automation.util;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
		System.setProperty("webdriver.gecko.driver", "");
	}

	@Override
	protected void stopService() {

	}

	@Override
	protected void createDriver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}
}
