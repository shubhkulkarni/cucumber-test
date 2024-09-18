package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import opencart.RegisterPage;
import utils.TestBase;

public class RegisterStepDef extends TestBase{
	
	private RegisterPage register;
	
	@Before
	public void setup() {
			init();
			System.out.println("called");
	}
	
	@After
	public void tear() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	@Given("I am on open cart webapp homepage")
	public void openCartApp() throws InterruptedException {
		System.out.println("from register" + driver);
		register = new RegisterPage(driver);
		register.visitPage();
	}

	@When("I click on My account section")
	public void i_click_on_my_account_section() {
	   register.navagateToMyAccounts();
	}

	@When("then click on Register")
	public void then_click_on_register() {
	    register.navigateToRegister();
	}

	@Then("Register account screen is opened")
	public void register_account_screen_is_opened() {
		String exp = "Register Account";
		String actual = register.getRegisterPageTitle();
		System.out.println("Expected = " + exp);
		System.out.println("Actual = " + actual);
		Assert.assertEquals(exp,actual);
	}

	@When("I fill the details like {string} {string} {string} {string} {string}")
	public void i_fill_the_details_like_shubham_kulkarni_sskambajogai1_gmail_com_ssk_opencart24(String firstName,String lastName,String email,String telephone,String pwd) {
	   register.fillDetails(firstName,lastName,email,telephone,pwd);
	}

	@When("click on privacy checkbox and continue button")
	public void click_on_privacy_checkbox_and_continue_button() throws InterruptedException {
	  register.continueRegister();
	}

}
