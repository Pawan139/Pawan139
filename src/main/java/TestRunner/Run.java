package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(features=".//Features/Login.feature",  
glue="StepDefinition",  
plugin = {"pretty","json:target/cucumber-reports/reports_json.json"})

public class Run extends AbstractTestNGCucumberTests
{

}
