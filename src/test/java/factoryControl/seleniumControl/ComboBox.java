package factoryControl.seleniumControl;

import factoryControl.Control;
import factoryControl.FactoryControl;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 11/16/2017.
 */
public class ComboBox extends Control {

    /**
     * This method is to select an option on comboBox element
     * @param optionValue
     */
    public void selectAnOption (String optionValue){
        this.find();
        String locatorXPath = "//option[contains(@label,'"+optionValue+"')]";
        Link option=new FactoryControl<>(Link.class).makeControl();
        option.searchCriteria= By.xpath(locatorXPath) ;
        option.nameElement="["+optionValue+"] option";

        this.click();
        option.click();

    }
}
