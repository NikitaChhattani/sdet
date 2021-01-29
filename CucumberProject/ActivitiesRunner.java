package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:/Users/NikitaChhattani/Desktop/JavaWork/CucumberProject/src/test/java/Features",
    glue = {"StepDefinitions"},
    tags = "@PostJob",
    strict = true
    //plugin = {"pretty", "html:test-reports/JobAlchemyTest3-reports"},
    //monochrome = true
)

public class ActivitiesRunner {
    //empty
}