package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest {
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void teardown() {
		if(driver!=null)
			driver.quit();
	}
	

	@Given("user is on the Account page")
	public void user_is_on_the_account_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://tutorialsninja.com/demo/");
	}

	@When("user click the product")
	public void user_click_the_product(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List
	}

	@Then("user searches for the items and adds to the cart and verifies the items in the cart")
	public void user_searches_for_the_items_and_adds_to_the_cart_and_verifies_the_items_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
