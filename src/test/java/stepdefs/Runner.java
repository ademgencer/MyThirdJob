package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/MyThirdJob.feature"},
        glue = "stepdefs",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/cucumber.json", // cucumber json report
                "html:test-output/cucumber-reports/cucumber.html", // cucumber html report
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class Runner extends AbstractTestNGCucumberTests {
}
