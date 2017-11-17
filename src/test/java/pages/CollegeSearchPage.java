package pages;

import driverHandler.Driver;
import factoryControl.FactoryControl;
import factoryControl.seleniumControl.*;
import factoryControl.seleniumControl.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;


/**
 * Created by Eynar on 11/16/2017.
 */
public class CollegeSearchPage {

    public Button locationButton=new FactoryControl<>(Button.class).makeControl();
    public Button majorsButton=new FactoryControl<>(Button.class).makeControl();
    public RadioButton bachelorsRadioButton=new FactoryControl<>(RadioButton.class).makeControl();
    public TextBox majorSearchField=new FactoryControl<>(TextBox.class).makeControl();
    public PickList majorSearchListPickList=new FactoryControl<>(PickList.class).makeControl();
    public PickList locationSearchListPickList=new FactoryControl<>(PickList.class).makeControl();
    public ListControl resultList=new FactoryControl<>(ListControl.class).makeControl();

    public CollegeSearchPage(){

        locationButton.searchCriteria= By.id("critHeader0");
        locationButton.nameElement="[Location] button";

        locationSearchListPickList.searchCriteria=By.id("critHeader0");
        locationSearchListPickList.nameElement="[Location Matching] PickList";

        majorsButton.searchCriteria= By.id("critHeader1");
        majorsButton.nameElement="[Majors] button";

        bachelorsRadioButton.searchCriteria= By.id("degreeTypeRadio0");
        bachelorsRadioButton.nameElement="[Bachelors] radio button";

        majorSearchField.searchCriteria=By.id("majorSearchText");
        majorSearchField.nameElement="[Major Search Text] Field";

        majorSearchListPickList.searchCriteria=By.id("matchingMajors");
        majorSearchListPickList.nameElement="[Major Matching] PickList";

        resultList.searchCriteria=By.xpath("//div[@class='matchingSection']");
        resultList.nameElement="List result";

    }
}
