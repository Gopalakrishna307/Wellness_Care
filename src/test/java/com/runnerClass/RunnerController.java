package com.runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\src\\test\\java",
		glue="com.stepDefinitions",
		dryRun = true,
		//monochrome = true,
		//tags = "@getID",
		plugin = "pretty"
		
		
		)
public class RunnerController extends AbstractTestNGCucumberTests {

}
