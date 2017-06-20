import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
import pages.StrategyDashboard;
import pages.TreeEditor;
import util.BrowserDriver;

/**
 * Created by sharvari on 15/6/17.
 */
public class BaseTestScript {
    @BeforeSuite
    public void login() {
        BrowserDriver.startBrowser("Chrome");
        BrowserDriver.maximizeBrowser();
        BrowserDriver.accessUrl("http://www.qa.harmonytoc.com");
        LoginPage loginPage = new LoginPage();
        loginPage.successfulLogin("sharvari.raut+10@forgeahead.io", "1");
    }
    @AfterSuite
    public void signOut(){
        TreeEditor homebutton = new TreeEditor();
        homebutton.navigateHome();
        StrategyDashboard logout = new StrategyDashboard();
        logout.logOut();
        BrowserDriver.closeBrowser();
    }
}
