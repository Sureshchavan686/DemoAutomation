package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/resources/Features/UpdateNaukriProfile.feature",
glue="com.stepdefinitions",
plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","rerun:target/rerun.txt"},
dryRun=false



)



public class Runner extends AbstractTestNGCucumberTests{
	
	

}
