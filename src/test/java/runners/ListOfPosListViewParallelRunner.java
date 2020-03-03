package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import javax.swing.text.html.ListView;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports","json:target/parallel-cucumber9.json"},
        features = "src/test/resources/features/5_BB-386.feature",
        glue = "step_definition"
//        tags = "@cucumber"


)
public class ListOfPosListViewParallelRunner {
}
