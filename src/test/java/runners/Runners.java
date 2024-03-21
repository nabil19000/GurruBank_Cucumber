package runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Login.feature",
        tags = "@ValidateManagerId",
        glue = "stepDefinition",
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html: target/reports/cucumber.html",
                "json: target/reports/cucumber.json"
        }

)
public class Runners {
}
