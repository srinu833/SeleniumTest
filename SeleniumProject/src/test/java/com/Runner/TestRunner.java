package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//tags="@Regression"
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue="com.Stepdefs",tags="@Smoke",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/SparkReport/ResultsReport.html","json:target/SparkReport/ResultsReport.json","rerun:target/failedrun.txt"}, monochrome=true)



public class TestRunner {

}
