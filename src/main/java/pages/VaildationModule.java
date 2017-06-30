package pages;

import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 26/6/17.
 */
public class VaildationModule extends GuiControl {

    Map<String,String> validationmap = new XMLReader().getObjectRepoData("validation");
    Map<String,String> treeeditormap = new XMLReader().getObjectRepoData("treeEditorheaderfooter");

    public void navigateValidation(){
        getWebElement(validationmap.get("navigatevalidation")).click();
    }
    public void introToTrees(){
        getWebElement(validationmap.get("introtrees")).click();
    }
    public void navigateNormalTree(){
        getWebElement(treeeditormap.get("normaltreeview")).click();
    }
    public void navigateUp(){
        getWebElement(treeeditormap.get("navigateup")).click();
    }
    public void navigateDown(){
        getWebElement(treeeditormap.get("navigatebottom")).click();
    }
    public void navigateLeft(){
        getWebElement(treeeditormap.get("navigateleft")).click();
    }
    public void navigateRight(){getWebElement(treeeditormap.get("navigateright")).click();}

    public void insertComment(String comment){
        getWebElement(validationmap.get("addcomment")).click();
        getWebElement(validationmap.get("commentText")).sendKeys(comment);
        getWebElement(validationmap.get("okcomment")).click();
    }
    public void statusValidated(){
        getWebElement(validationmap.get("statusvalidated")).click();
    }
    public void statusNotValidated(){
        getWebElement(validationmap.get("statusnotvalid")).click();
        waitForSeconds(2);
    }
    public void excelExport(){
        getWebElement(validationmap.get("exportexcel")).click();
        waitForSeconds(1);
    }
    public void reviewExpert(){
        getWebElement(validationmap.get("reviewbyexpert")).click();
    }
}
