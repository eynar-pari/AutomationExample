package pages;

import factoryControl.FactoryControl;
import factoryControl.seleniumControl.Button;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 11/16/2017.
 */
public class MainPage {

    public Button startSearchingButton=new FactoryControl<>(Button.class).makeControl();

    public MainPage(){
        startSearchingButton.searchCriteria= By.xpath("//img[@src='/_img/start_searching.jpg']");
        startSearchingButton.nameElement="[Start Searching] button";
    }
}
