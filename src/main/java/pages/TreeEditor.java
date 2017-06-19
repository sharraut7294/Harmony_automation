package pages;

import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 16/6/17.
 */
public class TreeEditor extends GuiControl {

    Map<String,String> treemap = new XMLReader().getObjectRepoData("treeEditor");

    public void navigateHome(){
        getWebElement(treemap.get("homebutton")).click();
    }
    public void addChild(String childname){
        try {
            Thread.sleep(10000);
            getWebElement(treemap.get("addchild")).click();
            getWebElement(treemap.get("childname")).sendKeys(childname);
            getWebElement(treemap.get("buttonok")).click();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addGoldratt(){
    try{
        getWebElement(treemap.get("addfromgoldratt")).click();
        Thread.sleep(6000);
        getWebElement(treemap.get("addgoldtree")).click();
    }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void addCommunity(){
        try{
            getWebElement(treemap.get("addfromcommunity")).click();
            Thread.sleep(6000);
            getWebElement(treemap.get("addcommtree")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
