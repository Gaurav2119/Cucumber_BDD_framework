package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class homePage extends Base {
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement accountButton;
	
	public homePage(WebDriver driver) {
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public loginPage click_AccountButton() {
		accountButton.click();
		return new loginPage(driver);
	}
	
	public String currentPage() {
        return driver.getCurrentUrl();
    }
}
