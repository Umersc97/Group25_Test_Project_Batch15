package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features" ,
        glue = "StepDefinitions",
        dryRun = false,
        tags = "@Smoke",
        plugin = {"pretty", "html:target/test-classes/Cucumber"}
)
public class SmokeRunner {
}
