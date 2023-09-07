package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps {

	@Given("I launch a browser")
	public void i_launch_a_browser() {

		System.out.println("Launching browser");

	}

	@When("I go to the ecom website")
	public void i_go_to_the_ecom_website() {
		System.out.println("Navigating to ecom webiste");

	}

	@Then("The title should be as expected")
	public void the_title_should_be_as_expected() {

		Assert.assertEquals("Your Store", "Your Store");
		System.out.println("Titel is as expected");

	}

	@Then("Close Browser")
	public void close_Browser() {
		System.out.println("Closed browser");

	}

}
