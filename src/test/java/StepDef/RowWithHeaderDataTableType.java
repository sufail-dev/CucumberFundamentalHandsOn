package StepDef;

import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import objects.Customer;

public class RowWithHeaderDataTableType {
	
//	@DataTableType
//	public Customer passData(Map<String,String> entry) {
//		return new Customer(entry.get("username"),entry.get("password"));
//		
//	}

@Given("Row With header DataTableType")
public void row_With_header_DataTableType(Customer customers) {
//	System.out.println("Username value :"+customers.getUsername());
//	System.out.println("Password value :"+customers.getPassword());
   
}
}
