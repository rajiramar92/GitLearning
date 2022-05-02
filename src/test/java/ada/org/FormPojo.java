package ada.org;

import org.helper.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPojo extends HelperClass {
	
	public FormPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="mobile")
	private WebElement mob;

	public WebElement getMob() {
		return mob;
	}

	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement mesgg;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement butn;

	@FindBy(id="code")
	private WebElement capcha;
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getCapcha() {
		return capcha;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMesgg() {
		return mesgg;
	}

	public WebElement getButn() {
		return butn;
	}
	
	
	
	
}
