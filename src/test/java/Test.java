import pages.LoginPage;
import pages.StrategyDashboard;
import util.BrowserDriver;


/**
 * Created by sharvari on 13/6/17.
 */

public class Test {

    @org.testng.annotations.Test
    public void login() {
        BrowserDriver.startBrowser("Chrome");
        BrowserDriver.accessUrl("http://www.qa.harmonytoc.com");
        LoginPage loginPage = new LoginPage();
        loginPage.successfulLogin("sharvari.raut+1@forgeahead.io","1");
        /*loginPage.forgotPassword("sharvari.raut+10@forgeahead.io");
        loginPage.translateLanguage();
        loginPage.switchTranslationOff();
        loginPage.unsuccessfulLogin("sharvari.raut+1","");*/

        StrategyDashboard tree = new StrategyDashboard();
        tree.createTree("New Tree by automation");
    }
}
