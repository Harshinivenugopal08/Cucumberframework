package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
    features = "src/test/java/cucumber/cucumber.feature",  
    glue = "stepdefinition",
    plugin = {"pretty", "html:target/cucumber.html"},
    monochrome = true,
    tags = "@tag2"
)
@Listeners(listeners.listeners.class)  // Attach TestNG Listener
public class test extends AbstractTestNGCucumberTests {
}
