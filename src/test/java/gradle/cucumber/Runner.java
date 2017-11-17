package gradle.cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import driverHandler.Driver;
import org.junit.runner.RunWith;

/**
 * Created by Eynar on 11/16/2017.
 */
@RunWith(Cucumber.class)
public class Runner {

    /**
     *  this method is executed before each scenario
     * @param scenario
     */
    @Before()
    public void beforeScenario(Scenario scenario) {
        Driver.getCurrentBrowser().getDriver().navigate().to("http://www.collegeview.com/");
    }

    /**
     * this method is executed after each scenario
     * @param scenario
     */
    @After()
    public void afterScenario(Scenario scenario) {

    }
 }

