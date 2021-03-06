package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E://AutomationProjects//Cucumber//Feature//LoginTests.feature",
                 glue = {"StepDef"},
                 dryRun = false,
                 monochrome = true,
                 plugin = { "pretty", "html:E://AutomationProjects//Cucumber//Reports//cucumber-reports.html" }

                 )
public class TestRunner
{


}
