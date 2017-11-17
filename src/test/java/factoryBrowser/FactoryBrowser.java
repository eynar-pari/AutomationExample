package factoryBrowser;
import static utils.Constant.*;


/**
 * Created by Eynar on 11/16/2017.
 */
public class FactoryBrowser {


    /**
     * This method is to make a specific browser
     * @param browser (i.e.: Chrome, Firefox)
     * @return browser object
     */
    public static Browser make(String browser){

        Browser browserBuilder;
        switch (browser.toUpperCase())
        {
            case FIREFOX:
                browserBuilder= new FireFox();
                break;
            case CHROME:
                browserBuilder= new Chrome();
                break;
            default:
                browserBuilder= new FireFox();
                break;

        }
        return browserBuilder;
    }
}
