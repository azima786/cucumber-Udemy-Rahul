package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
           features = "./src/test/java/features",
                   glue= "stepDefinitions",
                   tags = "@SmokeTest or @RegTest or @MobileTest",
                   dryRun = false, //if any of test cases is not mapped. It will not run
                   monochrome = true, //output will be detailed and pretty format
                   plugin = {"pretty", "html:target/cucumber",
                   "json:target/cucumber.json",
                   "junit:target/cakes.xml"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {





    }

