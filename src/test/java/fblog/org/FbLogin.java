package fblog.org;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.helper.HelperClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import jdk.nashorn.internal.ir.annotations.Ignore;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class FbLogin extends HelperClass{
	
	PojoClass p;
	
	
	@org.testng.annotations.Test(priority=-2)
	public static void tc1() {
	OpenChromeBrowser();
	urlLan("https://www.facebook.com");
	maxWind();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}
	
	  @Parameters({"enter","pass"})
	  @org.testng.annotations.Test(priority=2)
	  public void tc2(String idValue,String passInput) throws InterruptedException {
		 WebElement id = driver.findElement(By.id("email"));
		 toFillBox(id, idValue);
		org.testng.Assert.assertTrue(true);
		 
		 WebElement pass = driver.findElement(By.id("pass"));
		 toFillBox(pass, passInput);
		 
		 org.testng.Assert.assertTrue(true);
	}
	
	
  @org.testng.annotations.Test(priority=5)
  private void tc3() {
	  WebElement login = driver.findElement(By.name("login"));
		 toClick(login);
		 driver.close();

}
	
	
	}

