package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
	public static  WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert at;
	public static JavascriptExecutor js;
	public static Select s;
	
	
	public static void OpenChromeBrowser() { //1
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	
public static void openEdge() { //1
		
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
	}
	

public static void openFire() {
	WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
}
		
	public static void urlLan(String url) {//2
		driver.get(url);
	}
	public static void maxWind() {   //3
		driver.manage().window().maximize();

	}
	public static void fetchTitl() {  //4
		String title = driver.getTitle();
    System.out.println(title);
	}
	
	public static void close() { //5
		driver.close();
	}
	
	public static void refresh() { //6
		driver.navigate().refresh();
	}
	
	public static void toHold(int value) throws InterruptedException { //7
	Thread.sleep(value);

}
	
	
	public static void fetchUrl() {  //8
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void toFillBox(WebElement ref,String value) { //9
		ref.sendKeys(value);

	}
	
	public static void toClick(WebElement ref) { //10
		ref.click();

	}
	
	public static void moveElement(WebElement target) {//11
		a=new Actions(driver);
		a.moveToElement(target).perform();	
}
	
	
	public static void dragAndDrop(WebElement source,WebElement target) {//12
	a=new Actions(driver);
	a.dragAndDrop(source, target).perform();
		

	}
	
	
	public static void doubClick(WebElement click) {//13
		a=new Actions(driver);
		a.doubleClick(click).perform();

	}
	
	public static void singleClick(WebElement singclk) {//14
		a=new Actions(driver);
		a.contextClick(singclk).perform();

	}
	
	public static void copyPaste() throws AWTException {//15
	 r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	
	public static void keyDown(int number) throws AWTException { //16
		 r=new Robot();

		 for (int i = 0; i < number; i++) {
	
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
			}
	}
		 public static void keyUp(int number) throws AWTException { //17
			 r=new Robot();

			 for (int i = 0; i < number; i++) {
		
			 r.keyPress(KeyEvent.VK_UP);
			 r.keyRelease(KeyEvent.VK_UP);
			 
				}
		 }
		 
		 public static void alertAccept(WebElement Alert) {//18
			at = driver.switchTo().alert();
			at.accept();

		}
		 
		 public static void alertDecline() {//19
				at = driver.switchTo().alert();
				at.dismiss();
		 }
		 
		 public static void promptAlart(String value) {//20
		     at= driver.switchTo().alert();
			 at.sendKeys(value);
			 at.accept();
			 
			 
		}
		 
		 public static  void printAlart() {//21
			 at= driver.switchTo().alert();
			 System.out.println(at.getText());
			

		}
		 
		 public static void javaExcuSend(WebElement refer,String text) {//22
			 js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].setAttribute('value','text')", refer);
		
	}
		 
		 public static void javaExcuClick(WebElement clk) {//23
			 js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click()", clk);
		
	} 
		 
		 public static void javaExcuPrintAttr(WebElement print) {//24
			 js=(JavascriptExecutor)driver;
			 js.executeScript("return arguments[0].getAttribute('value')", print);
		
	} 
		 
		 
		 public static void scrollUp(WebElement scrollUp) {//25
			 js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView(false)",scrollUp);
		
	} 
		  
		 public static void scrollDown(WebElement scrollDown) {//26
			 js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		
		 
 }
		 public static void ScreenShot(String screen) throws IOException {  //27
			TakesScreenshot ts= (TakesScreenshot)driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			File a=new File("C:\\Users\\R RAJESWARI\\eclipse-workspace\\FrameworkExcers\\ScreenShot\\"+ screen +".png");
			FileUtils.copyFile(file,a);
		 }
		 
		 public static void frameSwitchInt(int id) {//28
			
			 driver.switchTo().frame(id);
			 
			 
		}
		 
		 
		 public static void frameSwitchWebEle(WebElement ref) {//29
				
			 driver.switchTo().frame(ref);
			 
			 
		}
		 
		 public static void frameSwitchInt(String IdNameValue) {//30
				
			 driver.switchTo().frame(IdNameValue);
			 
			 
		}
		 
		 
		 public static void singleSelectId(WebElement ref,int index) {//31
			s=new Select(ref);
			s.selectByIndex(index);
			
		}
		 
		 public static void singleSelectValue(WebElement ref,String Value) {//32
				s=new Select(ref);
				s.selectByValue(Value);
				
			}
		 
		 public static void singleSelectText(WebElement ref,String Text) {//33
				s=new Select(ref);
				s.selectByVisibleText(Text);
				
			}
		 
		 
		 
		 public static void multipleList(WebElement ref) {//34
				s=new Select(ref);
				boolean b = s.isMultiple();
				System.out.println(b);
				
			}
		 
		 public static void  printAllOptions(WebElement ref) {//35
				s=new Select(ref);
				List<WebElement> options = s.getOptions();
				for (int i = 0; i < options.size(); i++) {
					System.out.println(options.get(i).getText());
					
				}
				
				
			}
		 
		 public static void printFirstSelect(WebElement ref) {//36
				s=new Select(ref);
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				System.out.println(firstSelectedOption);
				
			}
		 
		 public static void printAllSelect(WebElement ref,String Text) {//37
				s=new Select(ref);
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (int i = 0; i < allSelectedOptions.size(); i++) {
					System.out.println(allSelectedOptions.get(i).getText());
				}	
					
			}
		 
		 
		 public static void deselectByText(WebElement ref,String text) {//38
				s=new Select(ref);
				s.deselectByVisibleText(text);
		 
		 
	}
	
	
		 
		 public static void deselectByValue(WebElement ref,String value) {//39
				s=new Select(ref);
				s.deselectByValue(value);
		 
		 
	}
	

		 public static void deselectByText(WebElement ref,int index) {//40
				s=new Select(ref);
				s.deselectByIndex(index);
		 
		 
	}
		 
		 public static void deselectAll(WebElement ref) {//41
				s=new Select(ref);
				s.deselectAll();
		 
		 
	}
		 
		 public static void parentId(){//42
			   String windowHandle = driver.getWindowHandle();
			   System.out.println(windowHandle);
	} 
		 public static void allWindowsId(){//43
			    Set<String> windowHandles = driver.getWindowHandles();
			    System.out.println(windowHandles);
			    for (String getId : windowHandles) {
			    	System.out.println(getId);				
				}    
	}	 
		 public static void SwitchWindowHandleTitle (){//44
			     
			    String title = driver.getTitle();
				driver.switchTo().window(title);
	}
	
		 public static void SwitchWindowHandleUrl (){//45
			 
			 String currentUrl = driver.getCurrentUrl();
				driver.switchTo().window(currentUrl);
		 }
	 
		 public static void SwitchWindowWindHandId(){//46
			   String Parehandle = driver.getWindowHandle();
		       System.out.println(Parehandle);
			   Set<String> allWindHand = driver.getWindowHandles();
			   System.out.println(allWindHand);
			   for (String getId : allWindHand) {
				    if (!getId.equals(Parehandle)) {
					   	   driver.switchTo().window(getId);
			}
			  }
			    	
					
				}    
             public static void SwitchWindowId (int index){//47
			 
            	 String Parehandle = driver.getWindowHandle();
  		       System.out.println(Parehandle);
  			   Set<String> allWindHand = driver.getWindowHandles();
  			   System.out.println(allWindHand);
  			   
  			   List<String> windowHand=new ArrayList<String>();
  			   windowHand.addAll(allWindHand);
  			   driver.switchTo().window(windowHand.get(index));
  			   
  			   
		 }
             public static void printText(WebElement ref) {//48
		      String text = ref.getText();
		      System.out.println(text);
	  }        
	
             public static void printAttributeValue(WebElement ref1,String value) {//49
				String attribute = ref1.getAttribute(value);
				System.out.println(attribute);

			}
             public static void closeAllBrowser() {//50
		        driver.quit();

		}
             
             public static void backSpace() throws AWTException {
				 r=new Robot();
				 
				 r.keyPress(KeyEvent.VK_TAB);
				 r.keyRelease(KeyEvent.VK_TAB);
				 
				 r.keyPress(KeyEvent.VK_CONTROL);
				 r.keyPress(KeyEvent.VK_A);	 
						 
				 r.keyRelease(KeyEvent.VK_CONTROL);
				 r.keyRelease(KeyEvent.VK_A);	
				 
				 r.keyPress(KeyEvent.VK_BACK_SPACE);
				 r.keyRelease(KeyEvent.VK_BACK_SPACE);

			}
	
            
             public static void fileUpload(String fileName) throws AWTException, InterruptedException {
            	 StringSelection sel=new StringSelection(fileName);
           		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
           		
           		Thread.sleep(6000);
           		
           		 r=new Robot();
           		
      
           		r.keyPress(KeyEvent.VK_CONTROL);
           		r.keyPress(KeyEvent.VK_V);
           		
           		r.keyRelease(KeyEvent.VK_CONTROL);
           		r.keyRelease(KeyEvent.VK_V);
           		
           		Thread.sleep(3000);
           		
           		r.keyPress(KeyEvent.VK_ENTER);
           		r.keyRelease(KeyEvent.VK_ENTER);
           		
        

			}
             
             public static void clickRadio() throws AWTException {
				r=new Robot();
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				
				r.keyPress(KeyEvent.VK_RIGHT);
				r.keyRelease(KeyEvent.VK_RIGHT);
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				

			}
           public static void enterAdd() throws AWTException {
			
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			
		}
             
             
         
        public static void enter() throws AWTException {
			
        	r=new Robot();
        	r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

		}	   
        	   
 
        	 public static void naukriform() throws AWTException {
        		  r=new Robot();
        	        
                 r.keyPress(KeyEvent.VK_M);
                 r.keyRelease(KeyEvent.VK_M);
                 
                 r.keyPress(KeyEvent.VK_A);
                 r.keyRelease(KeyEvent.VK_A);
                
                 r.keyPress(KeyEvent.VK_T);
                 r.keyRelease(KeyEvent.VK_T);
                 
                 r.keyPress(KeyEvent.VK_H);
                 r.keyRelease(KeyEvent.VK_H);
                 
                 r.keyPress(KeyEvent.VK_S);
                 r.keyRelease(KeyEvent.VK_S);
                 

			}
                
           public static void backsp() throws AWTException {
        	   r=new Robot();
        	   r.keyPress(KeyEvent.VK_BACK_SPACE);
        	   r.keyPress(KeyEvent.VK_BACK_SPACE);
        	   
		}

           
             
             
           
            public static String readFromExcel(String filename,int row,int cell,String sheetNo) throws IOException {
            	
            	File f=new File("C:\\Users\\R RAJESWARI\\eclipse-workspace\\FrameworkExcers\\ExnFiles\\"+ filename +".xlsx");
             	
             	FileInputStream file=new FileInputStream(f);
             	
             	Workbook a=new XSSFWorkbook(file);
             	
             	Sheet s = a.getSheet(sheetNo);
             	
             	Row r = s.getRow(row);
             	
             	Cell c = r.getCell(cell);
             	
               int type = c.getCellType();
            
                       
               String input=" ";
               
               if(type==1) {
            	   input = c.getStringCellValue();
            	   
            	   
               }
               else if (DateUtil.isCellDateFormatted(c)) {
            	   
            	   Date date = c.getDateCellValue();
            	   
            	   SimpleDateFormat  sim=new SimpleDateFormat("MMMM dd,yyyy");
            			    input = sim.format(date);
    			
    		} 
               else {
    			
            	   double numericCellValue = c.getNumericCellValue();
            	   
            	   long l=(long)numericCellValue;
            	   
            	    input = String.valueOf(l);
    		}
            	   
             	return input;
    				
    			}
            
      
        public static void imwait(int num) {
        	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(num));

		}    
            
            
        public static void browser(String input) {
        	Scanner s=new Scanner(System.in);
        	String next = s.next();
        	System.out.println(input);
        	switch (input) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;	
			
			default:
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			}
        	
        	
        	
        	

		}  
        
        
        
        
        
	}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	
 
             	
  	
            	
            	
		
	

	
	

