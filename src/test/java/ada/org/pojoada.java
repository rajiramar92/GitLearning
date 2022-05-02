package ada.org;

import org.helper.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoada extends HelperClass{
	
	public pojoada() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement loc;
	
	public WebElement getLoc() {
		return loc;
	}
	@FindBy(id="hotels")
	private WebElement hotel;
	
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datePickIn;
	
	
	@FindBy(id="datepick_out")
	private WebElement datePickOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radbutt;
	
	
	@FindBy(id="continue")
	private WebElement cont;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement ccv;
	
	@FindBy(id="cc_type")
	private WebElement ccty;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvNum;
	
	public WebElement getCcvNum() {
		return ccvNum;
	}
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	
	
	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadbutt() {
		return radbutt;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getCcty() {
		return ccty;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	
	@FindBy(id="book_now")
	private WebElement booknow;

}
