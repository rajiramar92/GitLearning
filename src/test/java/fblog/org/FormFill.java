package fblog.org;

import java.io.IOException;
import java.util.Date;

import org.helper.HelperClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ada.org.FormPojo;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FormFill extends HelperClass{

	@BeforeClass
	public static void tc1() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		driver.manage().window().maximize();

	}
	@Before	
	public void tc2() {
		Date a=new Date();
		System.out.println(a);

	}
	
	@After
	public void tc3() {
		Date a=new Date();
		System.out.println(a);

	}
	
	@Test
	public void tc4() throws IOException, InterruptedException {
		FormPojo f=new FormPojo();
	toFillBox(f.getFirstName(), readFromExcel("Datasheet", 1, 2, "form"));
	
	toFillBox(f.getLastName(), readFromExcel("Datasheet", 2, 2, "form"));
	toFillBox(f.getEmail(), readFromExcel("Datasheet", 3, 2, "form"));
	toFillBox(f.getMob(), readFromExcel("Datasheet", 4, 2, "form"));
	singleSelectId(f.getCountry(), 2);
	toFillBox(f.getCity(), readFromExcel("Datasheet", 5, 2, "form"));
	toFillBox(f.getMesgg(), readFromExcel("Datasheet", 6, 2, "form"));
	toFillBox(f.getCapcha(), readFromExcel("Datasheet", 7, 2, "form"));
	toClick(f.getButn());
	
		
	}
	@Test
	public void tc5() {
		FormPojo f=new FormPojo();
		
		WebElement name = f.getFirstName();
		Assert.assertEquals("check first Name", "Raji",name.getAttribute("value"));
		
		WebElement b = f.getLastName();
		Assert.assertEquals("check last name", "Ramar",b.getAttribute("value"));
		
		WebElement c = f.getEmail();
		Assert.assertEquals("check mail id", "abc@gmail.com",c.getAttribute("value"));
		
		WebElement d = f.getMob();
		Assert.assertEquals("check phone", "8879525741",d.getAttribute("value"));
		
		WebElement e = f.getMesgg();
		Assert.assertEquals("check Messg Datails", "Madurai",e.getAttribute("value"));
		
		WebElement u = f.getCapcha();
		Assert.assertEquals("check capcha", "VoY6",u.getAttribute("value"));
		
		
		
	
}
}
