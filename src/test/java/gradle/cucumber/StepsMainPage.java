package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.MainPage;

/**
 * Created by Eynar on 11/16/2017.
 */
public class StepsMainPage {

    MainPage mainPage = new MainPage();
    @Given("^I have connection on http://www.collegeview.com/$")
    public void I_have_connection_on_http_www_collegeview_com() throws Throwable {
    }

    @When("^I click on (Start Searching) button in Main page$")
    public void I_click_on_Start_Searching_button_in_Main_page(String nameButton ) throws Throwable {
        mainPage.startSearchingButton.click();
    }


}
