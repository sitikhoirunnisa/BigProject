package TestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        tags="@Team or @PositiveCase",
        glue={"StepDefinitions"},
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"}
)

public class TestRunBoard {
}
