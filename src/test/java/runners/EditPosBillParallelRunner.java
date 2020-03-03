package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-cucumber3.json"},
        features = "src/test/resources/features/7_BB-396.feature",
        glue = "step_definition"
//        tags = "@cucumber"

)

public class EditPosBillParallelRunner {
}
