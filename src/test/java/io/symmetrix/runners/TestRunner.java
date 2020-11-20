package io.symmetrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/**
 * - We have to define type of execution -> Cucumber.class
 * - @RunWith Annotation comes from JUnit
 * - @CucumberOptions() -> specify cucumber pass parameters
 * - features = "src/test/resources/features" -> path from content Root
 * - glue = "com/ceallo/test" -> path from source root
 *
 */

@CucumberOptions(
        plugin = {"json:target/cucumber.json"

        },
        features = "src/test/resources/features",
        glue = "io/symmetrix/step_definitions",
        //tags = "",
        dryRun = false
)
@RunWith(Cucumber.class)

public class TestRunner {
}
