package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"},
        features = "src/test/resources/features",
        glue = "step_definition",
        dryRun = false,
        tags = ""

)







public class CukesRunner {
}
