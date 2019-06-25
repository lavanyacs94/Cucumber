package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Stepm {
	
	static WebDriver driver;
	
	@Given("home")
	public void home() {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\lavs\\cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom");
	}

	@Given("Addcust")
	public void addcust() {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	}

	@When("filling")
	public void filling(DataTable dataTable) {
		
		Map<string,String> CD= dataTable.asMaps()
		
		
		
	    
	}

	@When("submiting")
	public void submiting() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user see customer id")
	public void user_see_customer_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	

}
