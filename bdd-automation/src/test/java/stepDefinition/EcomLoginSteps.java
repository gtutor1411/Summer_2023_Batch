package stepDefinition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EcomLoginSteps {

	WebDriver driver;

	@Given("I launch the browser")
	public void i_launch_the_browser() {
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", rootPath + "\\Drivers\\geckodriver.exe");
		// FirefoxOptions options = new FirefoxOptions();
		// options.addArguments("--remote-allow-origins=*");
		// driver = new FirefoxDriver(options);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("I go to the ecommerce site")
	public void i_go_to_the_ecommerce_site() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Then("the title should be as expected")
	public void the_title_should_be_as_expected() {
		String title = driver.getTitle();
		Assert.assertEquals("Account Login", title);

	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_user_name_and_password() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("myuser");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("I enter invalid username {string} and password {string}")
	public void i_enter_invalid_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}

	@Then("I should not be logged in")
	public void i_should_not_be_logged_in() {
		boolean result = false;
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.linkText("Edit your account information"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			result = true;
		} catch (Exception e) {
			result = false;
		}

		assertFalse(result);

	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();

	}

}
