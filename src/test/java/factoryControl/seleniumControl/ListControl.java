package factoryControl.seleniumControl;

import driverHandler.Driver;
import factoryControl.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by Eynar on 11/16/2017.
 */
public class ListControl extends Control {

    /**
     * This method is to select a specific value in table
     */
    public Map<String,String> GetMapValueAndMatch(){
        Map<String,String> values = new HashMap<>();
        this.find();
        WebElement myList = Driver.getCurrentBrowser().getDriver().findElement(searchCriteria);
        java.util.List<WebElement> divElements = myList.findElements(By.xpath("//div[contains(@class,'resultItem ')]"));
        for (WebElement div :divElements){
            java.util.List<WebElement> matchValue = div.findElements(By.xpath("//div/div/div[@class='column column1']/div/div[@class='percentMatch']"));
            java.util.List<WebElement> nameValue = div.findElements(By.xpath("//div/div/div[@class='column column3']/div/a[@class='name']"));
            Vector<String>key= new Vector<>();
            Vector<String>matchPercentage= new Vector<>();

            for (WebElement match : matchValue) {
                matchPercentage.add(match.getText());
            }
            for (WebElement name : nameValue) {
                key.add(name.getText());
            }
            for (int i = 0; i < key.size() ; i++) {
                values.put(key.get(i),matchPercentage.get(i));
            }
            break;
        }
        return values;
    }


}
