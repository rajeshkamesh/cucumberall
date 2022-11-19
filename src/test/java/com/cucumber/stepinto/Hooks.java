package com.cucumber.stepinto;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.AddHasLaunchApp;

import com.flipkart.resources.CommonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends CommonAction{
	CommonAction c = new CommonAction();
	
	@Before
	public void beforeScenario() {
		
		c.launch("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	}
	@After
	private void AfterScenerio() {
		driver.quit();
	}
	

}
