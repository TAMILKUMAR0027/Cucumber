package stepDefinitins;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartTest {
	WebDriver driver ;
	  WebDriverWait wait;
	@Given("the user is on the product page")
	public void the_user_is_on_the_product_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.demoblaze.com");
	}

	@When("the user clicks on the product {string}")
	public void the_user_clicks_on_the_product(String string) {
	    // Write code here that turns the phrase above into concrete actions\
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-success btn-lg']")));
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	}
	@Then("the user should get the alert message")
	public void the_user_should_get_the_alert_message() {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertEquals("Product added", alert.getText()); 
		alert.accept();	}
	
	@When("the user clicks the cart icon")
	public void the_user_clicks_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[text()='Cart']")).click();
	}

	@Then("the user should see both products on the cart page")
	public void the_user_should_see_both_products_on_the_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Delete']")));
	    Assert.assertEquals("Delete",driver.findElement(By.xpath("//a[text()='Delete']")).getText());
	}
	
	

	@Before
	public void setup() {
	   driver =new ChromeDriver();
	   wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	   driver.manage().window().maximize();
		
	}
	@After
	public void tearDown() {
		if(driver!=null)
		driver.quit();
	}

}
