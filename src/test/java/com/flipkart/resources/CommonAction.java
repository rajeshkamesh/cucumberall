package com.flipkart.resources;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {

	
	public static WebDriver driver;
	
	public void launch(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("settings//settings/clearBrowserData");

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
	}
	
	public void ScrollDown(WebElement name) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",name);
	}
	
	public void windowhandle() {
		String wh = driver.getWindowHandle();
		Set<String> wh2 = driver.getWindowHandles();
		List<String> wh3=new ArrayList<String>(wh2);
		for(String x:wh3) {
			if(!wh.equals(wh3)) {
				driver.switchTo().window(x);
			}
		}
		
	}
	public String getText(WebElement name) {
		String text = name.getText();
		return text;
	}
	public void insertText(String ref) {
		Actions a = new Actions(driver);
		a.sendKeys(ref).build().perform();
	}
	public void insertText(WebElement name, String value) {
		name.sendKeys(value);
	}
	public void insertTextJs(WebElement name, String value) {
		name.sendKeys(value,Keys.ENTER);
	}
	

}
