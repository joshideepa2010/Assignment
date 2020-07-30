package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"stepdefinitions"},tags= {"@SmokeTest,@RegressionTest,@End2End"})

public class TestRunner {
	

}
