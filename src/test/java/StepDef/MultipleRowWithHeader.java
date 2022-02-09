package StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;

public class MultipleRowWithHeader {
	
	@Given("multiple Row Credentials with Headers")
	public void multiple_Row_Credentials_with_Headers(List<Map<String,String>>  customers) {
		
		System.out.println("Row 0 username field value :"+customers.get(0).get("username"));
		System.out.println("Row 0 Password field value :"+customers.get(0).get("password"));
		System.out.println("Row 1 username field value :"+customers.get(1).get("username"));
		System.out.println("Row 1 Password field value :"+customers.get(1).get("password"));
	    
	}


}
