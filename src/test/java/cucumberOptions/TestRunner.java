package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/features",glue= "stepDefinitions", stepNotifications = true, tags = "@SmokeTest or @RegTest or @MobileTest"

        //"NOT @SanityTest" - will not run these
)

public class TestRunner {

}