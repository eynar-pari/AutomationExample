package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverHandler.Driver;
import org.junit.Assert;
import pages.CollegeSearchPage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Eynar on 11/16/2017.
 */
public class StepsCollegeSearchPage {
    CollegeSearchPage collegeSearchPage = new CollegeSearchPage();
    Map results= new HashMap<>();
    /**
     * This method is to do clink on button
     * @param nameButton
     * @throws Throwable
     */
    @And("^I click on (Location|Majors) button in College Search page$")
    public void I_click_on_Location_button_in_College_Search_page(String nameButton) throws Throwable {
        collegeSearchPage = new CollegeSearchPage();
        switch (nameButton){
             case "Location":
                 Driver.getCurrentBrowser().getDriver().switchTo().frame("supermatch");
                 System.out.print("PRESENT " + collegeSearchPage.locationButton.isElementPresent());
                 collegeSearchPage.locationButton.click();
                 break;
             case "Majors":
                 collegeSearchPage.majorsButton.click();
                 break;
         }
    }

    /**
     * This method is to select some option on picklist
     * @param optionValue
     * @throws Throwable
     */
    @And("^I select the (Ohio|.*) option in Location picklist$")
    public void I_select_the_Ohio_option_in_Location_in_picklist(String optionValue) throws Throwable {
             collegeSearchPage.locationSearchListPickList.selectAnDefinedOption(optionValue);
    }

    /**
     * This method is to select some option on radio button
     * @param nameRadioButton
     * @throws Throwable
     */
    @And("^I select the (Bachelors|Associate) radio button$")
    public void I_select_the_Bachelors_radio_button(String nameRadioButton) throws Throwable {
        switch (nameRadioButton){
            case "Bachelors":
                collegeSearchPage.bachelorsRadioButton.click();
                break;
            case "Associate":
                //todo
                break;
        }
    }

    /**
     * This method is to type some value in a field
     * @param nameField
     * @param value
     * @throws Throwable
     */
    @And("^I set the (MajorSearch) field with the value: (.*)$")
    public void I_set_the_MajorSearch_field_with_the_value_Computer_Software_Engineering(String nameField, String value) throws Throwable {
            collegeSearchPage.majorSearchField.setValue(value);
    }

    /**
     * This method is to select an option in a picklist
     * @param optionValue
     * @throws Throwable
     */
    @And("^I select the (.*) option in Major picklist$")
    public void I_select_the_Computer_Software_Engineering_option_in_Major_picklist(String optionValue) throws Throwable {
        collegeSearchPage.majorSearchListPickList.selectAnOption(optionValue);
    }

    /**
     * This method is to verify the match and listed items
     * @param value
     * @param listedMatched
     * @throws Throwable
     */
    @Then("^I verify the (Miami University-Oxford) is (listed|matched as 100%)$")
    public void I_verify_the_Miami_University_Oxford_is_listed(String value, String listedMatched) throws Throwable {

        if (listedMatched.contains("listed")){
            Assert.assertTrue("The "+value+" is not displayed in the list result",results.containsKey(value));
        }
        else{
            Assert.assertTrue("The "+value+" has different matching, it was : "+results.get(value)+ "but we expected 100%",results.get(value).equals("100%"));
        }
    }

    @Then("^I get the result in the ListResult$")
    public void I_get_the_result_in_the_ListResult() throws Throwable {
        results = collegeSearchPage.resultList.GetMapValueAndMatch();
    }
}
