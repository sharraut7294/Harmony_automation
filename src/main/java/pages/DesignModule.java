package pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 20/6/17.
 */
public class DesignModule extends GuiControl{
    Map<String,String> designmap = new XMLReader().getObjectRepoData("treeEditorheaderfooter");
    Map<String,String> treemap = new XMLReader().getObjectRepoData("treeEditor");

    public void changeTitle(String nodetitle){
        waitForSeconds(3);
        getWebElement(designmap.get("changenodetitle")).click();
        getWebElement(designmap.get("titletext")).sendKeys(nodetitle);
        getWebElement(designmap.get("titleok")).click();
    }
    public void addChild(String childname){
        try {
            Thread.sleep(2000);
            getWebElement(treemap.get("addchild")).click();
            getWebElement(treemap.get("childname")).sendKeys(childname);
            getWebElement(treemap.get("buttonok")).click();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void navigateUp(){
        waitForSeconds(5);
        getWebElement(designmap.get("navigateup")).click();
    }
    public void navigateDown(){
        waitForSeconds(5);
        getWebElement(designmap.get("navigatebottom")).click();
    }
    public void navigateLeft(){
        waitForSeconds(5);
        getWebElement(designmap.get("navigateleft")).click();
    }
    public void navigateRight(){
        waitForSeconds(5);
        getWebElement(designmap.get("navigateright")).click();
    }

    public void addParent(String parentname){
        waitForSeconds(3);
        getWebElement(treemap.get("addparent")).click();
        getWebElement(treemap.get("parentname")).sendKeys(parentname);
        getWebElement(treemap.get("okbutton")).click();
    }
    public boolean saveChanges(){
        getWebElement(designmap.get("savebutton")).click();
        try {
            alertPopup();
            return true;
        }
        catch (NoAlertPresentException exception) {
            exception.printStackTrace();
            waitForSeconds(3);
            return false;
        }
    }
    //Element not clickable error

    public void navigateNodeDetails(){
        Actions act = new Actions(getWebDriver());
        act.moveToElement(getWebElement(designmap.get("nodeDetails"))).click().build().perform();

    }
    public void deleteChildNode(){
        getWebElement(treemap.get("deletenode")).click();
        waitForSeconds(1);
    }
    public void deleteParentNodeMultipleChild(){
        getWebElement(treemap.get("deletenode")).click();
        waitForSeconds(1);
        alertPopup();
    }
    public void deleteParentSingleChild(){
        getWebElement(treemap.get("deletenode")).click();
        waitForSeconds(1);
        getWebElement(treemap.get("yesparent")).click();
        waitForSeconds(2);
    }
    public void deleteParentReplaceChild(){
        getWebElement(treemap.get("deletenode")).click();
        waitForSeconds(1);
        getWebElement(treemap.get("noparent")).click();
        waitForSeconds(1);
    }
    public void undoAction(){
        getWebElement(designmap.get("undoaction")).click();
        waitForSeconds(1);
    }
    public void redoAction(){
        getWebElement(designmap.get("redoaction")).click();
        waitForSeconds(1);
    }
    public void navigateDesignModule(){
        getWebElement(treemap.get("navigatedesign")).click();
    }

    public void addGoldratt(){
        getWebElement(treemap.get("addfromgoldratt")).click();
        waitForSeconds(2);
        getWebElement(treemap.get("projectgoldratttree")).click();
        Actions act1 = new Actions(getWebDriver());
        act1.moveToElement(getWebElement(treemap.get("addgoldtree"))).click().build().perform();
    }
    public void addCommunity(){
        getWebElement(treemap.get("addfromcommunity")).click();
        waitForSeconds(2);
        getWebElement(treemap.get("addcommtree")).click();
        waitForSeconds(1);

    }

    public void defineGroups(String groupname){
        Actions act = new Actions(getWebDriver());
        act.moveToElement(getWebElement(treemap.get("definegroups"))).click().build().perform();
        getWebElement(treemap.get("addgroup")).click();
        getWebElement(treemap.get("groupname")).sendKeys(groupname);
        waitForSeconds(1);
        getWebElement(treemap.get("savegroups")).click();
    }

    public void allocateGroups(){
        getWebElement(treemap.get("allocategroups")).click();
        Select oSelect = new Select(getWebElement(treemap.get("groupdropdown")));
        oSelect.selectByIndex(1);
        waitForSeconds(1);
        getWebElement(treemap.get("groupok")).click();
    }

    public void useAsTemplate(){
        getWebElement(treemap.get("treeselection")).click();
        getWebElement(treemap.get("treeselect")).click();
        getWebElement(treemap.get("usetemplate")).click();
        waitForSeconds(2);
        alertPopup();
    }
    public void openTree(){
        getWebElement(treemap.get("selectopen")).click();
    }
}
