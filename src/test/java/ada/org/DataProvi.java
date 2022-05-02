package ada.org;

import java.util.List;

import org.helper.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fblog.org.FailedClasss;

public class DataProvi extends HelperClass{
    

	@Test(retryAnalyzer=FailedClasss.class)
	public void tc1() {
		OpenChromeBrowser();
		urlLan("https://www.w3schools.com/html/html_tables.asp");
		maxWind();
			
	}
	
	  
	@org.junit.Test
	public void tc2() throws InterruptedException {
		WebElement row = driver.findElement(By.id("customers"));
		
		toHold(3000);
		
		List<WebElement> list = row.findElements(By.tagName("tr"));
		
		
		for (int i = 0; i <list.size(); i++) {
			WebElement e = list.get(i);
			List<WebElement> elements = e.findElements(By.tagName("th"));
			
	for (int j = 0; j < elements.size(); j++) {
		
		WebElement r = elements.get(j);
		String text = r.getText();
		System.out.println(text);
		
	}
	
			}
			
			
			
		}
         
		
			
		private void test() {
			

		}
		
			
		};
		}

		}

			
			
			
		}
			
		
		
		
		
		
		
		
	
		
		
		
	
	

	
	
	
	
		
	
