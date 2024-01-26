package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("the user on the Target Market Login Page")
	public void the_user_on_the_target_market_login_page() {
		System.out.println("Given = the user on the Target Market Login Page");
	}

	@When("the user logs in with username and password")
	public void the_user_logs_in_with_username_and_password() {
		System.out.println("When = the user logs in with username and password");
	}

	@Then("the welcome message is displayed")
	public void the_welcome_message_is_displayed() {
		System.out.println("Then = the welcome message is displayed");
	}

}
