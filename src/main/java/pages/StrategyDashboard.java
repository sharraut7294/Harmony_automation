package pages;

import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 16/6/17.
 */
public class StrategyDashboard extends GuiControl {
    Map <String,String> stmap = new XMLReader().getObjectRepoData("STdashboard");

    public void logout(){
        getWebElement(stmap.get("usernamedrop")).click();
        getWebElement(stmap.get("logout")).click();
    }

    public void createTree(String treename){
        getWebElement(stmap.get("createtree")).click();
        getWebElement(stmap.get("treename")).sendKeys(treename);
        getWebElement(stmap.get("okbutton")).click();

    }
}
