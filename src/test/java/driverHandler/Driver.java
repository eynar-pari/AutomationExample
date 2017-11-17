package driverHandler;
import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static utils.Constant.*;
/**
 * Created by Eynar on 11/16/2017.
 */
public class Driver {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private static Driver currentBrowser = null;

    /**
     * This method is the constructor for Driver (Browser)
     */
    private Driver(){
        driver = FactoryBrowser.make("FIREFOX").createDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, IMPLICIT_WAIT_TIME);
    }

    /**
     * This method is to get the current browser as singleton
     * @return
     */
    public static Driver getCurrentBrowser() {
        if (currentBrowser==null)
            currentBrowser=new Driver();
        return currentBrowser;
    }

    /**
     * This method is to get a driver
     * @return
     */
    public WebDriver getDriver(){
        return driver;
    }

    /**
     * This method is to get a wait element
     * @return
     */
    public WebDriverWait getWait() {
        return webDriverWait;
    }

    /**
     * This method is to close the driver
     */
    public void quitDriver() {
        try {
            driver.quit();
        } catch (Exception e) {
        }
        currentBrowser=null;
        driver = null;
    }

    /**
     * navigator windows
     * @param windowsTitle
     */
    public void goToWindows(String windowsTitle){
        Map<String,String> windows=new HashMap<>();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (String windowsId: Driver.getCurrentBrowser().getDriver().getWindowHandles()) {
            Driver.getCurrentBrowser().getDriver().switchTo().window(windowsId);
            windows.put(Driver.getCurrentBrowser().getDriver().getTitle(),windowsId);
        }

        Driver.getCurrentBrowser().getDriver().switchTo().window(windows.get(windowsTitle));
    }

}