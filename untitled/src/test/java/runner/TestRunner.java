package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = "stepDefinitions",
        tags = "@smoke",
        plugin = {"junit:target/cucumber-results.xml"},
        monochrome = true,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {
//    public static void extentReport() {
//        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//    }
}
