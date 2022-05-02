package org.stepdefinition;

import org.helper.HelperClass;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	WebDriver driver;
	
	@io.cucumber.java.Before(order=15)
	public void tc1() {
		System.out.println("started-1");
		

	}
	
	@io.cucumber.java.Before(order=5)
	public void tc2() {
		System.out.println("started-2");
		

	}
	@io.cucumber.java.Before
	public void tc3() {
		System.out.println("started-3");
		

	}
	

	@io.cucumber.java.After(order=55)
	public void tc4(io.cucumber.core.api.Scenario s) {
		 
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] as = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(as, "image/png");
			System.out.println("done");
			
		}
		
		
		

		@io.cucumber.java.After(order=15)
	public void tc5() {
		System.out.println("end-5");
		

	}
	@io.cucumber.java.After
	public void tc6() {
		System.out.println("end-6");
		

	}
	

}
