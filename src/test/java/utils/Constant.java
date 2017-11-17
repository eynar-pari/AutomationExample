package utils;

import java.io.File;

/**
 * Created by Eynar on 11/16/2017.
 */
public class Constant {

    public static String PATH_PROJECT=new File(".").getAbsolutePath().replace(".","");
    /**
     * ConstantWebUi
     */
    public static final String FIREFOX="FIREFOX";
    public static final String CHROME="CHROME";
    public static final int IMPLICIT_WAIT_TIME=30;
    public static final int EXPLICIT_WAIT_TIME=30;

    /**
     * variables for chrome
     */
    public static final String WEBDRIVER_CHROME_DRIVER="webdriver.chrome.driver";
    public static final String CHROME_DRIVER=System.getProperty("os.name").toLowerCase().contains("win")?PATH_PROJECT+"src\\test\\java\\drivers\\chromedriver.exe":PATH_PROJECT+"src/test/java/drivers/chromedriver";
    public static final String CHROME_NO_SANDBOX="--no-sandbox";
    public static final String CHROME_ENABLE_MEMORY="--enable-memory-info";
    public static final String CHROME_EXE=System.getProperty("os.name").toLowerCase().contains("win") ?"chrome.exe":"chrome";
    public static final String CHROME_SAVE_PASSWORD_MESSAGE="credentials_enable_service";

    /**
     * variables for firefox
     */
    public static final String WEBDRIVER_GECKO_DRIVER="webdriver.gecko.driver";
    public static final String FIREFOX_DRIVER=System.getProperty("os.name").toLowerCase().contains("win")?PATH_PROJECT+"src\\test\\java\\drivers\\geckodriver.exe":PATH_PROJECT+"src/test/java/drivers/geckodriver";

}
