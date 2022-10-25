package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/features",
        glue= "stepDefinitions",
        stepNotifications = true,
        tags = "@SmokeTest or @RegTest or @MobileTest",
        dryRun = false, //if any of test cases is not mapped. It will not run
        monochrome = true, //output will be detailed and pretty format
        plugin = {"pretty", "html:target/cucumber",
                "json:target/cucumber.json",
        "junit:target/cakes.xml"}

        //"NOT @SanityTest" - will not run these
)

public class TestRunner {

}