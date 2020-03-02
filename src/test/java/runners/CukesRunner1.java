package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-Cucumber1.json"},
        features = "src/test/resources/features/creatingPos.feature",
        glue = "step_definition",
        dryRun = false,
        tags = ""

)







public class CukesRunner1 {
}
