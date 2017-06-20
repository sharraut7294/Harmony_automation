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

    public void addGoldratt(){
    try{
        getWebElement(maptree.get("addfromgoldratt")).click();
        Thread.sleep(6000);
        getWebElement(maptree.get("addgoldtree")).click();
    }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addCommunity(){
        try{
            getWebElement(maptree.get("addfromcommunity")).click();
            Thread.sleep(6000);
            getWebElement(maptree.get("addcommtree")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
