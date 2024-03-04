package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/main/resources/feature"},
glue= {"StepDefinition"}, plugin= {"pretty", "html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	
}
