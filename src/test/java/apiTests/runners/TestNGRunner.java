package apiTests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"apiTests/stepDefinitions"},
        plugin = {"usage", "html:target/cucumber-reports.html","json:target/cucumber.json"},
        tags = "@apitest",
        monochrome = true
)

public class TestNGRunner extends AbstractTestNGCucumberTests{
}
