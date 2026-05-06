package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLoginTest {
	WebDriver driver;
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(string2);
	}

	@When("User click the Login Button")
	public void user_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should be able to see {string}")
	public void user_should_be_able_to_see(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if(string.equals("Invalid credentials"))
	    Assert.assertEquals(string, driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		else if(string.equals("username required"))
			Assert.assertEquals("Required",driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")).getText());
		else
			Assert.assertEquals("Required",driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText());
	}
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void tearDown() {
		if(driver!=null)
			driver.quit();
	}

}
