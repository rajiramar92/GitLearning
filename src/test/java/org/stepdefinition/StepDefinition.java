package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	
	/*@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password(DataTable d) {
	    
		Map<String, String> map = d.asMap(String.class, String.class);
		  driver.findElement(By.id("email")).sendKeys(map.get("username"));
			 driver.findElement(By.id("pass")).sendKeys(map.get("password"));
	}*/

	@When("User have to enter vAlid email and invalid password")
	public void user_have_to_enter_vAlid_email_and_invalid_password(DataTable d) {
	  List<Map<String, String>> mp = d.asMaps();
	  driver.findElement(By.id("email")).sendKeys(mp.get(1).get("username"));
		 driver.findElement(By.id("pass")).sendKeys(mp.get(1).get("password"));
	  
	}
	
	
	
	
	
/*	
@When("User have to enter VAlid email and invalid password")
public void user_have_to_enter_VAlid_email_and_invalid_password(DataTable d) {
    List<List<String>> list = d.asLists();
    
    driver.findElement(By.id("email")).sendKeys(list.get(2).get(1));
	 driver.findElement(By.id("pass")).sendKeys(list.get(3).get(2));
}*/


	

	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() {
	    
		 driver.findElement(By.id("email")).sendKeys("cwfhdf@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("pass$123");
	}

	@When("User have to enter invalid email and valid password")
	public void user_have_to_enter_invalid_email_and_valid_password() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("pavnnc$123");
	}
	
	
	
	/*@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String user, String passwrd) {
	   
		 driver.findElement(By.id("email")).sendKeys(user);
		 driver.findElement(By.id("pass")).sendKeys(passwrd);
		 
	}*/

	
	@Given("User have to enter fb login page")
	public void user_have_to_enter_fb_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
	}

	

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	 
	}

	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page() {
		 String url = driver.getCurrentUrl();
		 SoftAssert a=new SoftAssert();
		 a.assertTrue(url.contains("privacy_mutation_token"));
		 System.out.println("invalid user credentials");
		 
			}
	
	
	@Given("User have to click forgot password")
	public void user_have_to_click_forgot_password() throws InterruptedException {
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	    Thread.sleep(6000);
	}

	@When("User have to click invalid mobile number")
	public void user_have_to_click_invalid_mobile_number() throws InterruptedException {
	   driver.findElement(By.id("identify_email")).sendKeys("98121333133");
	   Thread.sleep(3000);
	}

	@When("User have to click login page")
	public void user_have_to_click_login_page() {
		driver.findElement(By.id("did_submit")).click();
	   
	}

	@Then("user have to be retry page")
	public void user_have_to_be_retry_page() {
		System.out.println("retry...");
	   
	}
	

	
	
	
	
	}

	    
	




