package StepDef;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class SingleRowWithNoHeader {

	@Given("my Credentials")
	public void my_Credentials(DataTable dataTable) {
		List<String>creds=dataTable.row(0);
		System.out.println("UserName : "+creds.get(0)+" Password :" +creds.get(1));
	  
	}
}
