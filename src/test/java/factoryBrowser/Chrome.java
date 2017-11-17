package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static utils.Constant.*;

/**
 * Created by Eynar on 11/16/2017.
 */
public class Chrome implements Browser {

    /**
     * This method is to create a Chrome driver
     * @return
     */
    @Override
    public WebDriver createDriver() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, CHROME_DRIVER);
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put(CHROME_SAVE_PASSWORD_MESSAGE, false);

        ChromeOptions options = new ChromeOptions();
        options.addArguments(CHROME_ENABLE_MEMORY);
        options.addArguments(CHROME_NO_SANDBOX);
        options.setExperimentalOption("prefs", prefs);
        WebDriver browser = new ChromeDriver(options);
        browser.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        return browser;
    }
}
