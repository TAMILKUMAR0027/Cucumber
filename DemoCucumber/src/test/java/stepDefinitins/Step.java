package stepDefinitins;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	@Given("user is on Home page")
	public void user_is_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1");
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2");
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4");
	}

}
