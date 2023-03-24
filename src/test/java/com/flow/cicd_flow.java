package com.flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class cicd_flow {

	
	@Test
	 void launch() {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
			
		 WebDriver driver = new ChromeDriver();
		
		 ChromeOptions options = new ChromeOptions();
		
		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.getTitle();
		
		driver.quit();
	}
}
