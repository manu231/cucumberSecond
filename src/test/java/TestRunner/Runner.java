package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:\\Users\\chill\\cucumber\\cucumberTest\\src\\test\\java\\Feature\\test.Feature",
  glue = {"StepDefinition"}
		
		)


public class Runner {

}