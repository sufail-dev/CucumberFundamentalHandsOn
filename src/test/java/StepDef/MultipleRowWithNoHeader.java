package StepDef;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MultipleRowWithNoHeader {
	@Given("my Multiple Row Credentials")
	//instead of data table we can pass collection as argument 
	//eg: public void my_Multiple_Row_Credentials(List<List<String>> cred)
	//List<List> will work in single row as well
	public void my_Multiple_Row_Credentials(DataTable dataTable) {
		List<List<String>> cred=dataTable.asLists();
		System.out.println("ROW 0 Username :" +cred.get(0).get(0));
		System.out.println("ROW 0 Password :" +cred.get(0).get(1));
		System.out.println("ROW 1 Username :" +cred.get(1).get(0));
		System.out.println("ROW 1 Password :" +cred.get(1).get(1));
	}
	
}

