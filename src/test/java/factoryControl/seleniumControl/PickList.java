package factoryControl.seleniumControl;

import factoryControl.Control;
import factoryControl.FactoryControl;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 11/16/2017.
 */
public class PickList extends Control {

    /**
     * This method is to select an option on comboBox element
     * @param optionValue
     */
    public void selectAnOption (String optionValue){
        this.find();
        String locatorXPath = "//span[contains(.,'"+optionValue+"')]";
        Link option=new FactoryControl<>(Link.class).makeControl();
        option.searchCriteria= By.xpath(locatorXPath) ;
        option.nameElement="["+optionValue+"] option";

        this.click();
        option.click();

    }

    public void selectAnDefinedOption (String optionValue){
        this.find();
        String locatorXPath = "//form[@id='locationCriteria']/div/div/div[2]/div[47]/div/div";
        Link option=new FactoryControl<>(Link.class).makeControl();
        option.searchCriteria= By.xpath(locatorXPath) ;
        option.nameElement="["+optionValue+"] option";
        option.click();
    }

}
