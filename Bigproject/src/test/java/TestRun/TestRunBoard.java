package TestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/Board.html"},
        features ="src/test/resources/features/GroupChat.feature",
        tags ="@BPN-12",
        glue ={"stepDefinition"}

)

public class TestRunBoard {
}


