package ada.org;

import java.time.Duration;

import org.helper.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fblog.org.PojoClass;
import fblog.org.RunWith;

public class Gmail extends HelperClass{
	PojoClass p;
	@Test
	private void tc1() {
		OpenChromeBrowser();
		urlLan("https://www.redbus.in/");
	    maxWind();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	

}
	
	@Test
	private void tc2() throws InterruptedException {
		 p=new PojoClass();
		p.getSignin().click();
		p.getSignlink().click();
		frameSwitchInt(1);
		WebElement mob = p.getEnterMob();
		mob.sendKeys("8838871562");
		Assert.assertEquals(mob.getAttribute("value"),"8838871562");
	}

	
	@Test
	private void tc4() {
		close();
}
}