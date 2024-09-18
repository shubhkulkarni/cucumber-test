package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import opencart.LoginPage;
import opencart.RegisterPage;
import utils.TestBase;

public class LoginStepDef extends TestBase {
		
		
		private LoginPage login;

		
	    @When("^then click on Login$")
	    public void iClickOnLogin() {
	       login = new LoginPage(driver);
	       login.visitLoginPage();
	    }

	    @Then("^Login screen is opened$")
	    public void loginScreenIsOpened() {
	        System.out.println(login.getLoginPageText());
	    }

	    @When("I fill the details like {string} {string}")
	    public void iFillDetails(String email, String password) {
	       login.fillDetails(email, password);
	    }

	    @When("click on login button")
	    public void iClickOnLoginButton() {
	       login.clickLogin();
	    }

	    @Then("^My orders page should be displayed$")
	    public void myOrdersPageIsDisplayed() throws InterruptedException {
	        System.out.println(login.getMyOrders());
	        Thread.sleep(3000);
	    }
	}



