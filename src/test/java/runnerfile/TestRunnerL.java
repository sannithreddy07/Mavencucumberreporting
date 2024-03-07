package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/loginorh.feature",glue = {"stepdefinitions"}, monochrome=true,
publish=true,plugin= {"pretty","json:target/JSONreports/reports.json"})
public class TestRunnerL {
	

}
