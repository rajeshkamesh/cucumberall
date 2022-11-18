package com.cucumber.stepinto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	static WebDriver driver;
	@Given("open page")
	public void open_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.manage().window().maximize();
	}

	@Given("enter signup page")
	public void enter_signup_page() {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	}

	@When("user input name")
	public void user_input_name() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kumar");
	}

	@When("user input email and password")
	public void user_input_email_and_password() {
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("rajeshhkamesh123@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("rajeshhkamesh123@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("rajeshkumar");
	}

	@When("user input date of birth and gender")
	public void user_input_date_of_birth_and_gender() {
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Nov");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1991");
	//	WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

	@Then("complete sigup")
	public void complete_sigup() {
	   driver.findElement(By.linkText("Sign Up"));
	   driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   driver.quit();
	}

	@When("user input name  using oneD list")
	public void user_input_name_using_oneD_list(DataTable dataTable) {
		String name1;
		String name2;
	    List<String> datas = dataTable.asList();
	   name1= datas.get(0);
	   name2=datas.get(1);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name1);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(name2);
	}

	@When("user input email and password using oneD list")
	public void user_input_email_and_password_using_oneD_list(DataTable dataTable) {
	  String name3;
	  String name4;
	  String name5;
	  List<String> datas = dataTable.asList();
	  name3=datas.get(0);
	  name4=datas.get(1);
	  name5=datas.get(2);
	  
	  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(name3);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(name4);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(name5);
	 
	}



}
