package form.org;

import java.io.IOException;

import org.helper.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ada.org.form;

public class FormReg extends HelperClass {
	form f;
	@Test(groups="smoke")
	private void tc1() {
		OpenChromeBrowser();
		urlLan("https://www.toolsqa.com/selenium-training/#enroll-form");
		maxWind();
	}
	
	@Test(groups="sanity")
	private void tc2() throws IOException, InterruptedException {
		 f=new form();
		 toHold(9000);
	 f.getFirstName().sendKeys(readFromExcel("input", 0, 1, "Sheet1"));
	 f.getLastName().sendKeys(readFromExcel("input", 1, 1, "Sheet1"));
 
	}
	
		
	@Test(groups="regression")
	private void tc3() throws IOException, InterruptedException {
		 f=new form();
	 f.getMail().sendKeys(readFromExcel("input", 2, 1, "Sheet1"));
	 f.getMobileNo().sendKeys(readFromExcel("input", 3, 1, "Sheet1"));

	
	
	
	}
	
	@Test(groups="regression")
	private void tc4() throws IOException, InterruptedException {
		 f=new form();
	WebElement c = f.getCountry();
	singleSelectId(c, 13);
	
	}
	
	@Test(groups= {"sanity","smoke"})
	private void tc5() throws IOException, InterruptedException {
		 f=new form();
	f.getCity().sendKeys(readFromExcel("input", 4, 1, "Sheet1"));
	f.getTextBox().sendKeys(readFromExcel("input", 5, 1, "Sheet1"));
	f.getButton().click();
	}
	
	

}
