package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Users/NikitaChhattani/Desktop/JavaWork/IBM/src/test/java/Features",
    glue = {"StepDefinitions"},
    tags = "@SmokeTest",
    strict = true,
    plugin = {"json:test-reports/json-report.json"},
    monochrome = true
)

public class ActivitiesRunner {
    //empty
}