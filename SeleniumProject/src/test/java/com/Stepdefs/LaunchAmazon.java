package com.Stepdefs;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchAmazon {
	WebDriver driver = new ChromeDriver();
	@Given("User launches browser")
	public void user_launches_browser() {
		System.out.print("User Launching Amazon");
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	    
	}

	@When("User enter credentials {string} and {string}")
	public void user_enter_credentials(String usr, String pwd) {
		assertEquals(usr, "TestUser");
	}

	@Then("User Loggedin")
	public void user_loggedin() {
	   
		assertEquals("Test", "Test");
		//WebDriver driver = new ChromeDriver();
		driver.close();
	}
	@Then("User LoggedOut")
	public void user_LoggedOut() {
	   
		assertEquals("Test", "Tester");
		//WebDriver driver = new ChromeDriver();
		driver.close();
	}
	
	
}
