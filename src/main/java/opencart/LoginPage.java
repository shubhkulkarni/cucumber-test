package opencart;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Login']") 
	private WebElement LoginLink;
	
	 @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
	    private WebElement returningCustomerHeader;

	    @FindBy(id = "input-email")
	    private WebElement emailInput;

	    @FindBy(id = "input-password")
	    private WebElement passwordInput;

	    @FindBy(xpath = "//input[@value='Login']")
	    private WebElement loginButton;

	    @FindBy(xpath = "//h2[normalize-space()='My Orders']")
	    private WebElement myOrdersHeader;
	
	 public void visitLoginPage() {
		 LoginLink.click();
	 }
	 
	 public String getLoginPageText() {
		 return returningCustomerHeader.getText();
	 }
	 
	 public void fillDetails(String email, String password) {
		 emailInput.sendKeys(email);
		 passwordInput.sendKeys(password);
	 }
	 
	 public void clickLogin() {
		 loginButton.click();
	 }
	
	 public String getMyOrders() {
		 return myOrdersHeader.getText();
	 }
}
