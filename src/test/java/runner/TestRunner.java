package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"StepDefinitions"},
		plugin = {"pretty", "html: cucumber_report/report.html"}
		//tags = "@invalidEmail"
		)
public class TestRunner {

}
