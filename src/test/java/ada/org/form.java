package ada.org;

import org.helper.HelperClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class form extends HelperClass {
	

     
	public form() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;

	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getButton() {
		return button;
	}


	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;

	
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;

		
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileNo;
	
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement textBox;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement button;

	@FindBy(id="email")
	private WebElement mail;


	public WebElement getMail() {
		return mail;
	}
	
	
}
