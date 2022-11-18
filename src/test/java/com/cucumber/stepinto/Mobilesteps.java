package com.cucumber.stepinto;
import com.flipkart.objectrepository.Mobilepage;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.objectrepository.Mobilepage;
import com.flipkart.resources.CommonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.flipkart.objectrepository.Mobilepage;

public class Mobilesteps extends CommonAction{
	CommonAction c = new CommonAction();
	Mobilepage m = new Mobilepage();
	//static WebDriver driver;
	@Given("user login to flipkart")
	public void user_login_to_flipkart() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		c.launch("https://www.amazon.in/");
	
//		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	@When("user search mobile {string}")
	public void user_search_mobile(String string) {
		names = string;
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		//WebElement textbox2 = m.getInputtext();
		c.insertTextJs(textbox2, string);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));
		c.ScrollDown(mobile1);
//		JavascriptExecutor js3=(JavascriptExecutor)driver;
//		js3.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		mobile1.click();
	 
	}
String names;
	@When("user search mobile")
	public void user_search_mobile() {
		names = "realme";
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		//WebElement textbox = m.getInputtext();
		c.insertTextJs(textbox, names);
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));
		mobile1.getText();
		c.ScrollDown(mobile1);
//		JavascriptExecutor js2=(JavascriptExecutor)driver;
//		js2.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		mobile1.click();
		
	
	}

	@When("user choose the mobile")
	public void user_choose_the_mobile() {
		c.windowhandle();
		
	}

	@When("user doing payment by using UPI")
	public void user_doing_payment_by_using_UPI() {
		WebElement buynow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		//WebElement buynow = m.getBuynow();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",buynow);
//		
		c.ScrollDown(buynow);
		buynow.click();
		driver.quit();
		//Assert.assertEquals("Buy Now", text);
	    
	}

	@Then("user receiving confirmation message")
	public void user_receiving_confirmation_message() {
	   System.out.println("last");
	}
	@When("user search mobile using oneD list")
	public void user_search_mobile_using_d_list(DataTable dataTable) {
		List<String> datas = dataTable.asList();
		
		names =datas.get(1);
		//WebElement fe4 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement fe4 = m.getInputtext();
		c.insertTextJs(fe4, names);
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));

		mobile1.getText();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		c.ScrollDown(mobile1);
		mobile1.click();
		
		
	   
	}
	@When("user search mobile using oneD map")
	public void user_search_mobile_using_oneD_map(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		names = data.get("phone2");
		//WebElement fe3 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement fe3 = m.getInputtext();
		c.insertTextJs(fe3, names);
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));
		c.ScrollDown(mobile1);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		
		mobile1.click();
	}
	
	
}