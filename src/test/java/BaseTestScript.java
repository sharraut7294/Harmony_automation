import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.StrategyDashboard;
import pages.TreeEditor;
import util.BrowserDriver;

/**
 * Created by sharvari on 15/6/17.
 */
public class BaseTestScript {
    @BeforeClass
    public void login() {
        BrowserDriver.startBrowser("Chrome");
        BrowserDriver.maximizeBrowser();
        BrowserDriver.accessUrl("http://www.qa.harmonytoc.com");
        LoginPage loginPage = new LoginPage();
        loginPage.successfulLogin("sharvari.raut+10@forgeahead.io", "1");
    }
    @AfterClass
    /*public void home(){
        TreeEditor homebutton = new TreeEditor();
        homebutton.navigateHome();
    }*/
    public void signOut(){
        /*StrategyDashboard logout = new StrategyDashboard();
        logout.logOut();*/
        //BrowserDriver.closeBrowser();
    }
}
