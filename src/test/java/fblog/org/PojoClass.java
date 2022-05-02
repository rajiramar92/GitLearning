package fblog.org;

import org.helper.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends HelperClass{
	
	

	public PojoClass() {
		PageFactory.initElements(driver,this); 
	}

	@FindBy(id="signin-block")
	private WebElement signin;
	
	
	@FindBy(id="signInLink")
	private WebElement signlink;
	
	
	@FindBy(id="mobileNoInp")
	  private WebElement enterMob;
	

	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[1]")
	private WebElement capcha;


	public WebElement getSignin() {
		return signin;
	}


	public WebElement getSignlink() {
		return signlink;
	}


	public WebElement getEnterMob() {
		return enterMob;
	}


	public WebElement getCapcha() {
		return capcha;
	}
	
	
}
