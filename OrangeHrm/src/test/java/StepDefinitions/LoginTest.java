package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
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

	@Given("User is on Loginpage")
	public void user_is_on_loginpage() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> signUp=dataTable.asLists(String.class);
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				

				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(signUp.get(i).get(j));
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(signUp.get(i).get(j));
			}
		}
	
	}

	@When("User click  Login Button")
	public void user_click_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should be able to login successfullyy and dashbard page open")
	public void user_should_be_able_to_login_successfullyy_and_dashbard_page_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("New page opened");
	}

}
