package pages;

import util.GuiControl;
import util.XMLReader;

import java.util.Map;

/**
 * Created by sharvari on 21/6/17.
 */
public class NodeDetailsPage extends GuiControl {
    Map<String,String> nodemap = new XMLReader().getObjectRepoData("treeEditor");

    public void addStrategyDetails(String strategy){
        waitForSeconds(2);
        frame("Strategy_ifr");
        getWebElement(nodemap.get("strategydetails")).sendKeys(strategy);
        switchMain();
    }
    public void addTacticDetails(String tactic){
        waitForSeconds(1);
        frame("Tactics_ifr");
        getWebElement(nodemap.get("tacticdetails")).sendKeys(tactic);
        switchMain();
    }

    public void strategyUp(){
        getWebElement(nodemap.get("strategyarrow")).click();
    }

    public void addNecessaryAssumptions(String necessaryassumptions){
        waitForSeconds(1);
        frame("NecessaryAssumptions_ifr");
        getWebElement(nodemap.get("necessaryassumptions")).sendKeys(necessaryassumptions);
        switchMain();
    }
    public void  tacticUp(){
        getWebElement(nodemap.get("tacticuparrow")).click();
    }

    public void parallelAssumptions(String parallelassumptions){
        waitForSeconds(1);
        frame("ParallelAssumptions_ifr");
        getWebElement(nodemap.get("parallelassumptions")).sendKeys(parallelassumptions);
        switchMain();
    }
    public void tacticDown(){
        getWebElement(nodemap.get("tacticdownarrow")).click();
    }
    public void sufficiencyAssumptions(String sufficiencyassumptions){
        frame("SufficiencyAssumptions_ifr");
        getWebElement(nodemap.get("sufficiencyassumptions")).sendKeys(sufficiencyassumptions);
        switchMain();
    }
    public void showHideAssumptions(){
        getWebElement(nodemap.get("showhideassumptions")).click();
    }
    public void showFormatting(){

        getWebElement(nodemap.get("showformatting")).click();
        waitForSeconds(1);
    }
    public void hideFormatting(){
        getWebElement(nodemap.get("hideformatting")).click();
    }
    public void strategyLinkedFiles(String strategylink){
        getWebElement(nodemap.get("strategylinkedfiles")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("addstrategylink")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("enterstrategylink")).sendKeys(strategylink);
        waitForSeconds(1);
        getWebElement(nodemap.get("oklink")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("okattach")).click();
    }
    public void tacticLinkedFiles(String tacticlink){
        getWebElement(nodemap.get("tacticlinkedfiles")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("tacticlink")).click();
        getWebElement(nodemap.get("entertacticlink")).sendKeys(tacticlink);
        waitForSeconds(1);
        getWebElement(nodemap.get("oktacticlink")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("oktacticattach")).click();
    }

    public void strategyPlanning(){
        getWebElement(nodemap.get("strategyplanning")).click();
    }
    public void saveStrategyPlanning(){
        getWebElement(nodemap.get("savestrategy")).click();
        waitForSeconds(1);
    }
    public void tacticPlanning(){
        getWebElement(nodemap.get("tacticplanning")).click();
    }
    public void saveTacticPlanning(){
        getWebElement(nodemap.get("savetactic")).click();
        waitForSeconds(1);
    }
    public void presentationMode(){
        getWebElement(nodemap.get("fullscreenmode")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationdown")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationdown")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationdown")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationdown")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationup")).click();
        waitForSeconds(1);
        getWebElement(nodemap.get("presentationup")).click();
        getWebElement(nodemap.get("presentationmode")).click();

    }

    public void closeDetails(){
        getWebElement(nodemap.get("closedetails")).click();
    }
}
