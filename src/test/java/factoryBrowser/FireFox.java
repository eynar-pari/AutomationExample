package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static utils.Constant.*;
/**
 * Created by Eynar on 11/16/2017.
 */
public class FireFox implements Browser {

    /**
     * This method is to create a firefox driver
     * @return
     */
    @Override
    public WebDriver createDriver() {
        System.setProperty(WEBDRIVER_GECKO_DRIVER,FIREFOX_DRIVER);
        return new FirefoxDriver();
    }
}
