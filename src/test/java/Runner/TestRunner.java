package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",
glue="stepDefinitions",
//tags= "@primus1234", 
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:CucumberReport/report.html","html:target/cucumber-reports"})
public class TestRunner {
	
}