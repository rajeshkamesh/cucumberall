package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.CommonAction;

public class Mobilepage extends CommonAction {
	
	public Mobilepage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement Buynow;

	public WebElement getBuynow() {
		return Buynow;
	}

	public WebElement getInputtext() {
		return Inputtext;
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement Inputtext;
	
	
	

}
