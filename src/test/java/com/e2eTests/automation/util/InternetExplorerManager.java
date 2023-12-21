package com.e2eTests.automation.util;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerManager extends DriverManager {

	@Override
	protected void startService() {
		System.setProperty("webdriver.ie.driver", "");
	}

	@Override
	protected void stopService() {

	}

	@Override
	protected void createDriver() {
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

	}
}
