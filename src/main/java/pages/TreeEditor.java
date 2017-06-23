package pages;

import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 16/6/17.
 */
public class TreeEditor extends GuiControl {

    Map<String,String> maptree = new XMLReader().getObjectRepoData("treeEditor");
    public void navigateHome(){
        getWebElement(maptree.get("homebutton")).click();
    }
}
