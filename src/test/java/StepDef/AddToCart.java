package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {

	@Given("I am on the store page")
	public void i_am_on_the_store_page() {
		System.out.println("I am on the store page");
	   
	}

	@When("I add a {string} to the cart")
	public void i_add_a_to_the_cart(String string) {
		System.out.println("Product added to the cart");
	}

	@Then("I see {int} {string} in the cart")
	public void i_see_in_the_cart(Integer int1, String string) {
		System.out.println("prodcut in the cart");
	}
	
}
