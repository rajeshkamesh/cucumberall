package com.cucumber.stepinto;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.Mobilepage;
import com.flipkart.resources.CommonAction;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
		
public class Tvpurchase extends CommonAction {
	
	CommonAction c= new CommonAction();
	Mobilepage m = new Mobilepage();
	String names;
	@When("user search tv")
	public void user_search_tv() {
		names = "Philips";
		//WebElement fe = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement fe = m.getInputtext();
		c.insertTextJs(fe, names);
		WebElement mobile1 =driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));
		mobile1.getText();
		//JavascriptExecutor js2=(JavascriptExecutor)driver;
		//js2.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		c.ScrollDown(mobile1);
		mobile1.click();
		
	    
	}
	@When("user search tv using oneD list")
	public void user_search_tv_using_oneD_list(DataTable dataTable) {
		List<String> datas = dataTable.asList();
		
		names =datas.get(1);
		//WebElement fe2 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement fe2 = m.getInputtext();
		c.insertTextJs(fe2, names);
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));

		//mobile1.getText();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		c.ScrollDown(mobile1);
		mobile1.click();
	    
	}
	@When("user search tv {string}")
	public void user_search_tv(String string) {
		names = string;
		//WebElement f = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement f = m.getInputtext();
		c.insertTextJs(f, names);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement mobile1 = driver.findElement(By.xpath("(//span[contains(text(),'"+names+"')])[8]"));
		//JavascriptExecutor js3=(JavascriptExecutor)driver;
		//js3.executeScript("arguments[0].scrollIntoView(true)",mobile1);
		c.ScrollDown(mobile1);
		mobile1.click();
		
	}
	@When("user choose the tv")
	public void user_choose_the_tv() {
		c.windowhandle();
	  
	}

}
