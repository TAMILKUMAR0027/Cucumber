package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultipleInputs {
	WebDriver driver;
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}

	@Given("User is HRMLogin page")
	public void user_is_hrm_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("User enters invalid credentials and login unsuccessfull")
	public void user_enters_invalid_credentials_and_login_unsuccessfull(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String,String>>user=dataTable.asMaps(String.class,String.class);
	    for(Map<String,String>form:user) {
	    	String username=form.get("Username");
	    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	    	String password=form.get("Password");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Assert.assertEquals(form.get("ErrorMessage"), driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());

	    }
	}
}
