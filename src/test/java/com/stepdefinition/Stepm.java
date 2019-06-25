package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
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
	public void filling(DataTable dataTable1) {
		
		Map<String,String> CDM = dataTable1. asMap(String.class,String.class);
		System.out.println(CDM);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(CDM.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(CDM.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(CDM.get("email"));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(CDM.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(CDM.get("phone"));
		}
@When("submiting")
	public void submiting() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user see customer id")
	public void user_see_customer_id() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());

	}}
