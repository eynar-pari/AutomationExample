package factoryControl.seleniumControl;

import driverHandler.Driver;
import factoryControl.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Eynar on 11/16/2017.
 */
public class Table extends Control {

    private final String TR="tr";
    private final String TD="td";
    /**
     * This method is to select a specific value in table
     * @param value
     */
    public void selectValue(String value){
        this.find();
        WebElement mytable = Driver.getCurrentBrowser().getDriver().findElement(searchCriteria);
        List<WebElement> rowsTable = mytable.findElements(By.tagName(TR));
        for (WebElement row :rowsTable){
            List<WebElement> columnsRow = row.findElements(By.tagName(TD));
            for (WebElement column :columnsRow){
                String celltext = column.getText();
                if (celltext.equals(value)){
                    column.click();}
            }
        }

    }


}
