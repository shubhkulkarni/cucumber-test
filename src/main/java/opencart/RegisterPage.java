package opencart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']") 
	private WebElement MyAccount;
	
	@FindBy(xpath = "//img[@title='naveenopencart']") 
	private WebElement Logo;
	
	@FindBy(xpath = "//a[normalize-space()='Login']") 
	private WebElement LoginLink;
	
	@FindBy(xpath = "(//a[normalize-space()='Register'])[1]")
    private WebElement registerLink;

    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    private WebElement registerAccountHeader;

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordInput;

    @FindBy(name = "agree")
    private WebElement agreeCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    //Methods
    
    public void visitPage() throws InterruptedException {
    	this.driver.get("https://naveenautomationlabs.com/opencart/");
    	this.driver.manage().window().maximize();
    	Thread.sleep(3000);
    }
    
    public void navagateToMyAccounts () {
    	MyAccount.click();
    }
    
    public void navigateToRegister() {
    	registerLink.click();
    }
    
    public String getRegisterPageTitle() {
    	return registerAccountHeader.getText();
    }
    
    public void fillDetails(String firstName,String lastName,String email,String telephone,String pwd) {
    	firstNameInput.sendKeys(firstName);
    	lastNameInput.sendKeys(lastName);
    	emailInput.sendKeys(email);
    	telephoneInput.sendKeys(telephone);
    	passwordInput.sendKeys(pwd);
    	confirmPasswordInput.sendKeys(pwd);
    }
    
    public void continueRegister() throws InterruptedException {
    	agreeCheckbox.click();
    	Thread.sleep(3000);
//    	continueButton.click();
    }
}
