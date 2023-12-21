package com.e2eTests.automation.util;


import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	protected void startService() {
		System.setProperty("webdriver.egde.driver", "");
	}

	@Override
	protected void stopService() {

	}

	@Override
	protected void createDriver() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}
}
