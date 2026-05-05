package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitins.LoginTest;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports/Cucumber.html"},features = "src/test/resources/seleniumdemo/login.feature",tags=("not @InValidCredentials"),glue="stepDefinitins")

public class JunitRunner {

}
