package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-cucumber7.json"},
        features = "src/test/resources/features/editingPos-Pricing.feature",
        glue = "step_definition"
//        tags = "@cucumber"


)

public class EditPosPricingParallelRunner {
}
