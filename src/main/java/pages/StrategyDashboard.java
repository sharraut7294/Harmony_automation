package pages;
import util.GuiControl;
import util.XMLReader;
import java.util.Map;

/**
 * Created by sharvari on 16/6/17.
 */
public class StrategyDashboard extends GuiControl {
    Map <String,String> stmap = new XMLReader().getObjectRepoData("STdashboard");

    public void logOut(){
        getWebElement(stmap.get("usernamedrop")).click();
        getWebElement(stmap.get("logout")).click();
    }

    public void createTree(String treename){
        getWebElement(stmap.get("createtree")).click();
        getWebElement(stmap.get("treename")).sendKeys(treename);
        getWebElement(stmap.get("okbutton")).click();

    }

    public void selectTree(){
        getWebElement(stmap.get("treeselect")).click();
    }

    public void shareTree(String useremail, String username){
     try {
        getWebElement(stmap.get("privateshare")).click();
        getWebElement(stmap.get("adduser")).click();
        getWebElement(stmap.get("useremail1")).sendKeys(useremail);
        getWebElement(stmap.get("username1")).sendKeys(username);
        getWebElement(stmap.get("canchangeall")).click();
        getWebElement(stmap.get("sharebutton")).click();
        Thread.sleep(8000);
        getWebElement(stmap.get("shareok")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
