package fblog.org;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.helper.HelperClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ada.org.pojoada;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin extends HelperClass {
	
	 //pojoada p;

	
	public void tc1() {
		 Result result = JUnitCore.runClasses(FormFill.class);
		
		 
		
		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		//driver.get("http://www.adactin.com/HotelApp/");
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		WebElement css = driver.findElement(By.xpath("//img[@alt='Google']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript
//		("arguments[0].setAttribute('style','max-height:200;object-position')", css);
//	
	}
	
	
	
	}
	
	
	
	
	
	
	/*@Before
	public 	void tc2() {
		Date d=new Date();
		System.out.println(d);

	}
	@After
	public void tc3() {
		Date d=new Date();
		System.out.println(d);
*/

	/*}
     @AfterClass
	public static void tc4() {
		driver.quit();

	}
	@Test
     public void tc5() throws IOException, AWTException, InterruptedException {
    	  p=new pojoada();
    	  toFillBox(p.getUsrname(),readFromExcel("Datasheet", 1, 2,"Inputs"));
    	  toFillBox(p.getPass(), readFromExcel("Datasheet", 2, 2, "Inputs"));
    	  toClick(p.getLogin());
	      singleSelectId(p.getLoc(), 1);
	      singleSelectId(p.getHotel(), 2);
	     singleSelectId(p.getRoomtype(), 3);
	     singleSelectId(p.getRoomnos(), 6);
	backSpace();
	toHold(6000);
	toFillBox(p.getDatePickIn(), "10/05/2022");
	backSpace();
	toFillBox(p.getDatePickOut(), "12/05/2022");
	singleSelectId(p.getAdult(),1);	
	singleSelectId(p.getChild(), 2);
	toClick(p.getSubmit());
	   toHold(15000);
	   toClick(p.getRadbutt());
	   toClick(p.getCont());
	   toHold(15000);
	   toFillBox(p.getFirstName(),readFromExcel("Datasheet",5, 2, "Inputs"));
	   toFillBox(p.getLastName(),readFromExcel("Datasheet",6, 2, "Inputs"));
	   toFillBox(p.getAdd(),readFromExcel("Datasheet",7, 2, "Inputs"));
	   toFillBox(p.getCcv(),readFromExcel("Datasheet",8, 2, "Inputs"));
	   singleSelectId(p.getCcty(), 2);
	   singleSelectId(p.getExpmon(), 5);
	   singleSelectId(p.getExpyear(), 7);
	   toFillBox(p.getCcvNum(),readFromExcel("Datasheet",9, 2, "Inputs"));
	   toClick(p.getBooknow());
	   WebElement order = p.getBooknow();
	   String string = order.getAttribute("value");
	   System.out.println(string);
	}
	
*/
	 
   

	  
		
     
     
    

