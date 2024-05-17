package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Features/Login.feature",

		glue = "StepDefination", dryRun = true, monochrome = true, plugin = { "pretty" }

)





public class User{
	

}
