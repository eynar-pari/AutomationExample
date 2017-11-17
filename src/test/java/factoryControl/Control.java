package factoryControl;

import static utils.Constant.*;
import driverHandler.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by Eynar on 11/16/2017.
 */
public abstract class  Control {

    public By searchCriteria;
    public WebElement control;
    public String nameElement="";

    /**
     * This method is to find and webElement based on searchCriteria attribute
     * @return
     */
    public WebElement find(){
        WebDriverWait wait = new WebDriverWait( Driver.getCurrentBrowser().getDriver(), EXPLICIT_WAIT_TIME);
        wait.until(ExpectedConditions.elementToBeClickable(searchCriteria));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCriteria));
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isDisplayed();
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isEnabled();
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isSelected();
        return Driver.getCurrentBrowser().getDriver().findElement(searchCriteria);
    }


    /**
     * This method is to wait an element based on the locator
     * @param locator
     */
    private void WaitElement(By locator){
    }

    /**
     * This method is to do click on control
     */
    public void click(){
        control=this.find();
        control.click();
    }

    /**
     * This method is to do double click on control
     */
    public void doubleClick(){
        control= this.find();
        control.click();
        control.click();
    }

    /**
     * This method is to set a value on field
     * @param value String value
     */
    public void setValue(String value){
        control=this.find();
        control.sendKeys(value);
    }

    /**
     * This method is to set a value and press Enter key
     * @param value String value
     */
    public void setValueAndEnter(String value){
        control=this.find();
        control.sendKeys(value);
        control.sendKeys(Keys.ENTER);
    }

    /**
     * Check if some element is present
     * @return
     */
    public boolean isElementPresent() {
        try {
            Driver.getCurrentBrowser().getDriver().findElement(searchCriteria);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
