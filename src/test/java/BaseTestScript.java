import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import util.BrowserDriver;

/**
 * Created by sharvari on 15/6/17.
 */
public class BaseTestScript {
    @BeforeClass
    public void login() {
        BrowserDriver.startBrowser("Chrome");
        BrowserDriver.accessUrl("http://www.qa.harmonytoc.com");
        LoginPage loginPage = new LoginPage();
        loginPage.successfulLogin("sharvari.raut+1@forgeahead.io", "1");
    }
}
