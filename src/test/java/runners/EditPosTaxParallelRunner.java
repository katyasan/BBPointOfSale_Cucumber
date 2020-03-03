package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-cucumber8.json"},
        features = "src/test/resources/features/4_BB-385.feature",
        glue = "step_definition"
//        tags = "@cucumber"


)
public class EditPosTaxParallelRunner {
}
