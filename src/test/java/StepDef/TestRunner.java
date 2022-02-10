package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
monochrome=true,
plugin={"pretty","html:target/HtmlReports"},
	glue= {"StepDef"},
	tags="@prod"
		)
public class TestRunner {
	
	
	//to run from cmd
	//mvn clean test -Dcucumber.filter.tags="@prod" 
	//-Dcucumber.features="src\\test\\resources\\Features" -Dcucumber.glue="StepDef"

}
