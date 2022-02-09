package StepDef;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import objects.Customer;

public class RowsWithNoHeaderAsDataTableType {
	@DataTableType
	public Customer customerEntry(List<String> entry) {
		return new Customer(entry.get(0),entry.get(1));
		
	}
//	@DataTableType
//	public Customer customerEntries(List<String> entries) {
//		return new Customer(entries.get(0),entries.get(1));
//		
//	}
	
	@Given("my DataTable Row Credentials")
	public void my_DataTable_Row_Credentials(Customer customer) {
		System.out.println("UserName with DataTableType: " +customer.getUsername());
		System.out.println("Password with DataTableType: " +customer.getPassword());
		
	  
	}
	//if we have multiple row
//	@Given("my DataTable with Multiple Rows")
//	public void my_DataTable_with_Multiple_Rows(List<Customer> customers) {
//	    System.out.println("ROW 0 username DataTableType :"+customers.get(0).getUsername());
//	    System.out.println("ROW 0 Password DataTableType :"+customers.get(0).getPassword());
//	    System.out.println("ROW 1 username DataTableType :"+customers.get(1).getUsername());
//	    System.out.println("ROW 1 Password DataTableType :"+customers.get(1).getPassword());
//	}
}
