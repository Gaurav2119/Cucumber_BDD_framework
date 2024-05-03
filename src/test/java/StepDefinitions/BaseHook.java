package StepDefinitions;


import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseHook extends Base {
//	public static WebDriver driver;
	
	public BaseHook() {
		super();
	}
	
	@Before
	public void setup() {
		Base.driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser.name"));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.amazon.in");
	}

	@After
	public void tearDown() {
		
		Base.driver.quit();
	}
	
	public static WebDriver getDriver() { 
		return Base.driver;
		}
}
