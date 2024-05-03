package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class loginPage extends Base {
	public static String error_message = "We cannot find an account with that email address";

	//Objects
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement emailText;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath = "//div[contains(@class,\"a-row\")]/span")
	private WebElement emailDisplayed;
	
	@FindBy(xpath = "//div[@class=\"a-alert-content\"]//descendant::span")
	private WebElement emailError;
	
	
	public loginPage(WebDriver driver) {
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setEmailText(String email) {
		emailText.sendKeys(email);
	}
	
	public void clickContinueButton() {
		ContinueButton.click();
	}
	
	public Boolean isEmailDisplayed() {
		return emailDisplayed.isDisplayed();
	}
	
	public String errorWithEmail() {
		return emailError.getText();
	}
	
}
