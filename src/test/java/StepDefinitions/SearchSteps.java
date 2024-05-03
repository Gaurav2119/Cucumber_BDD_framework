package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.searchedProductPage;

public class SearchSteps {

	private searchedProductPage productsearch = new searchedProductPage(BaseHook.getDriver());
	private homePage homepage = new homePage(BaseHook.getDriver());

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		
		assertEquals(homepage.currentPage(), productsearch.currentPage(), "User is not on homepage");
	}

	@When("User searches for {string}")
	public void user_searches_for(String product) {

		productsearch.SetTextInSearchBox(product);
		productsearch.ClickSearchButton();

	}

	@Then("Search results for {string} are displayed")
	public void search_results_for_are_displayed(String product) {
		assertTrue(productsearch.searchedProductResult().contains(product), "Result not displayed accordingly");
	}

	@When("User clicks on the Search button without entering a product")
	public void user_clicks_on_the_search_button_without_entering_a_product() {

		productsearch.ClickSearchButton();
	}

	@Then("User remains on the Amazon homepage")
	public void user_remains_on_the_amazon_homepage() {
		assertEquals(homepage.currentPage(), productsearch.currentPage(), "User is not on homepage");
	}
}
