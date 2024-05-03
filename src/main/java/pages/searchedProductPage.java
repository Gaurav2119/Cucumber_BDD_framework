package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class searchedProductPage extends Base {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement setTextInSearchBox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	private WebElement resultText;
	
	public searchedProductPage(WebDriver driver) {
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SetTextInSearchBox(String product) {
		setTextInSearchBox.sendKeys(product);
	}
	
	public void ClickSearchButton() {
		searchButton.click();
	}
	
	public String searchedProductResult() {
		return resultText.getText();
	}
	
	public String currentPage() {
        return driver.getCurrentUrl();
    }

}
