package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepso {
	
	static WebDriver driver;
	
	@Given("T_home page")
	public void t_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-11\\lavs\\cucumber1\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("C_add_customer_button")
	public void c_add_customer_button() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("F_details {string},{string},{string},{string},{string},{string},{string}")
	public void f_details(String MonthRent, String Freeloc, String FreeInt, String FreeSms, String Loccharges, String Intcharges, String SMScharges) {
		
		driver.findElement(By.id("rental1")).sendKeys(MonthRent);
		  driver.findElement(By.id("local_minutes")).sendKeys(Freeloc);
		  driver.findElement(By.id("inter_minutes")).sendKeys(FreeInt);
		  driver.findElement(By.id("sms_pack")).sendKeys(FreeSms);
		  driver.findElement(By.id("minutes_charges")).sendKeys(Loccharges);
		  driver.findElement(By.id("inter_charges")).sendKeys(Intcharges);
		  driver.findElement(By.id("sms_charges")).sendKeys(SMScharges);
	   
	}
	
	

	@When("C_submit")
	public void c_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("S_success")
	public void s_success() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());

	}

}
