package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		System.out.println("In Login Page");
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Entered username and password");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("Cliced on the login button");  
	}

	@Then("User is Navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("I am on the home Page");
	}	

}
