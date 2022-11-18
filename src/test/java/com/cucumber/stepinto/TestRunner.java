package com.cucumber.stepinto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
					glue = "com.cucumber.stepinto",
					plugin = "html:target",
					monochrome = true, //remove uwanted things  in console
					dryRun = false,
					tags = {"@tv"}) //~ignore , "1d" 0r "test"= operator 
				
public class TestRunner {
	

}
