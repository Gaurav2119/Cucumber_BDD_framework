package StepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.loginPage;

public class EmailSteps {
	
	private WebDriver driver = BaseHook.getDriver();
	
	loginPage lp;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		homePage home = new homePage(driver);
		
		lp = home.click_AccountButton();
	}
	
	@When("User enters valid email {string}")
	public void user_enters_valid_email_address(String valid_email) {
		lp.setEmailText(valid_email);
	}
	
	@When("User enters invalid email {string}")
	public void user_enters_invalid_email_format(String invalid_email) {
		lp.setEmailText(invalid_email);
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
	    
		lp.clickContinueButton();
	}

	@Then("User redirects to password page")
	public void user_redirects_to_password_page() {
		assertTrue(lp.isEmailDisplayed(), "Password page not displayed");
	}
	
	@Then("User stays on the same page with an error message")
	public void user_stays_on_the_same_page_with_an_error_message() {
		Assert.fail("This Case is failed");
		//assertEquals(lp.errorWithEmail(), loginPage.error_message, "No error is thrown");
	}
}
