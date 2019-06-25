package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Stepl {
	static WebDriver driver;

	@Given("telecom home page")
	public void telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-11\\lavs\\cucumber1\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom");
		}
@Given("clicks Add customer button")
	public void clicks_Add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    }
@When("filling all detils")
	public void filling_all_detils(DataTable dataTable) {
		
	List<String> CD = dataTable.asList(String.class);
	System.out.println(CD);
	driver.findElement(By.xpath("//label[@for='done']")).click();
	driver.findElement(By.id("fname")).sendKeys(CD.get(0));
	driver.findElement(By.id("lname")).sendKeys(CD.get(1));
	driver.findElement(By.id("email")).sendKeys(CD.get(2));
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(CD.get(3));
	driver.findElement(By.id("telephoneno")).sendKeys(CD.get(4));
}
@When("clicks submit button")
	public void clicks_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
@Then("see customer id")
	public void see_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
}
}
