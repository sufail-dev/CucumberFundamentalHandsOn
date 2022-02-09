package StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;




public class SingleRowWithHeader {
	@Given("my Single Row Credentials with Headers")
//	public void my_Single_Row_Credentials_with_Headers(List<List<String>> customers) {
//		
//		System.out.println("Row username field value :"+customers.get(1).get(0));
//		System.out.println("Row Password field value :"+customers.get(1).get(1));
//		
//	  
//	}
public void my_Single_Row_Credentials_with_Headers(List<Map<String,String>> customers) {
		
		System.out.println("Row username field value :"+customers.get(0).get("username"));
		System.out.println("Row Password field value :"+customers.get(0).get("password"));
		
	  
	}
	
	

}
