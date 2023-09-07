package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class TagSteps {
	
	
	@Given("This is a reg test")
	public void this_is_a_reg_test() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	}

	@Given("This is a login test")
	public void this_is_a_login_test() {
		System.out.println("login");  
	}

	@Given("This is a payment test")
	public void this_is_a_payment_test() {
		System.out.println("Payment");
	}

	@Given("This is a  search test")
	public void this_is_a_search_test() {
		System.out.println("search");
	}

	@Given("This is a logout test")
	public void this_is_a_logout_test() {
		System.out.println("Logout");
	}


}
