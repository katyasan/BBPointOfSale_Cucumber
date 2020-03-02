package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-cucumber6.json"},
        features = "src/test/resources/features/editingPos-PosBoxHrdw.feature",
        glue = "step_definition"


)
public class EditPosPosBoxHrdwParallelRunner {
}
