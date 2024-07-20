package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//tags="@Regression"
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue="com.Stepdefs",tags="@Smoke",plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/SparkReport/ResultsReport.json","rerun:target/failedrun.txt"}, monochrome=true)



public class TestRunner {

}
