package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import util.GuiControl;
import util.XMLReader;

import java.util.Map;
/**
 * Created by sharvari on 5/7/17.
 */
public class PlanningModule extends GuiControl {

    Map <String,String> planmap = new XMLReader().getObjectRepoData("planning");
    Map<String,String> editmap = new XMLReader().getObjectRepoData("treeEditorheaderfooter");

    public void navigatePlanning(){
        getWebElement(planmap.get("navigateplanning")).click();
    }
    public void addResources(String firstname,String lastname,String emailid,String phoneno, String title, String cost){
        getWebElement(planmap.get("manageresources")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("addresource")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("firstname")).sendKeys(firstname);
        waitForSeconds(2);
        getWebElement(planmap.get("lastname")).sendKeys(lastname);
        waitForSeconds(2);
        getWebElement(planmap.get("email")).sendKeys(emailid);
        waitForSeconds(2);
        getWebElement(planmap.get("phonenumber")).sendKeys(phoneno);
        waitForSeconds(2);
        getWebElement(planmap.get("resourcetitle")).sendKeys(title);
        getWebElement(planmap.get("resourcecost")).sendKeys(cost);
        waitForSeconds(2);
        getWebElement(planmap.get("saveresource")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("closeresource")).click();
    }
    public void changePrefrences(String buffercc, String bufferaggregate, String tacticdays, String strategydays)
    {
        getWebElement(planmap.get("planningpreferences")).click();
        getWebElement(planmap.get("buffercc")).clear();
        waitForSeconds(2);
        getWebElement(planmap.get("buffercc")).sendKeys(buffercc);
        waitForSeconds(2);
        getWebElement(planmap.get("bufferagrregate")).clear();
        waitForSeconds(2);
        getWebElement(planmap.get("bufferagrregate")).sendKeys(bufferaggregate);
        waitForSeconds(2);
        getWebElement(planmap.get("defaulttacticdays")).clear();
        getWebElement(planmap.get("defaulttacticdays")).sendKeys(tacticdays);
        waitForSeconds(2);
        getWebElement(planmap.get("defaultstrategydays")).clear();
        getWebElement(planmap.get("defaultstrategydays")).sendKeys(strategydays);
        waitForSeconds(2);
        getWebElement(planmap.get("savepreferences")).click();
    }

    public void createProjectNetwork(){
        getWebElement(planmap.get("projectnetwork")).click();
        waitForSeconds(2);
        alertPopup();
        getWebElement(planmap.get("yesnetwork")).click();
        waitForSeconds(2);
    }
    public void ganttChart(){
        getWebElement(planmap.get("ganttchart")).click();
        getWebElement(planmap.get("addcolumns")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("strategydays")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("tacticdays")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("budgetedcost")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("actualcost")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("criticalchain")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("closeganttchart")).click();
    }
    public void criticalChainSimulation(){
        getWebElement(planmap.get("criticalchainsimulation")).click();
        waitForSeconds(2);
    }
    public void allocateTacticDays(String tacticdays){
        getWebElement(planmap.get("allocateresources")).click();
        getWebElement(planmap.get("edit-tactic")).click();
        getWebElement(planmap.get("tactic-days")).clear();
        getWebElement(planmap.get("tactic-days")).sendKeys(tacticdays);
        getWebElement(planmap.get("tactic-days")).sendKeys(Keys.ENTER);
        getWebElement(planmap.get("recalculate")).click();
        getWebElement(planmap.get("allocatemytasks")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocatekanban")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocategridview")).click();
    }
    public void allocateTacticManager(){
        getWebElement(planmap.get("edittacticmanager")).click();
        Select oSelect = new Select(getWebElement(planmap.get("tacticmanagerdropdown")));
        oSelect.selectByVisibleText("Kedar Bhingare, SE");
        getWebElement(planmap.get("tacticmanagerdropdown")).sendKeys(Keys.ENTER);
        getWebElement(planmap.get("recalculate")).click();
        getWebElement(planmap.get("allocatemytasks")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocatekanban")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocategridview")).click();
    }
    public void allocateTitle(String nodetitle){
        getWebElement(planmap.get("allocatetitle")).click();
        getWebElement(planmap.get("changetitle")).clear();
        getWebElement(planmap.get("changetitle")).sendKeys(nodetitle);
        getWebElement(planmap.get("changetitle")).sendKeys(Keys.ENTER);
        getWebElement(planmap.get("recalculate")).click();
        getWebElement(planmap.get("allocatemytasks")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocatekanban")).click();
        waitForSeconds(3);
        getWebElement(planmap.get("allocategridview")).click();
    }
    public void allocateTacticParticipant(String participantworkdays){
        getWebElement(planmap.get("allocateparticipant")).click();
        getWebElement(planmap.get("addall")).click();
        waitForSeconds(1);
        getWebElement(planmap.get("removeparticipant")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("includeincosting")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("participantworkdays")).clear();
        waitForSeconds(2);
        getWebElement(planmap.get("participantworkdays")).sendKeys(participantworkdays);
        waitForSeconds(2);
        getWebElement(planmap.get("saveparticipant")).click();
    }
    public void projectCosting(){
        getWebElement(planmap.get("projectcostinglink")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("projectcostingmytasks")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("projectcostingkanban")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("detailtreeview")).click();
    }
    public void navigateUp(){
        waitForSeconds(5);
        getWebElement(editmap.get("navigateup")).click();
    }
    public void navigateDown(){
        waitForSeconds(5);
        getWebElement(editmap.get("navigatebottom")).click();
    }
    public void navigateLeft(){
        waitForSeconds(5);
        getWebElement(editmap.get("navigateleft")).click();
    }
    public void navigateRight(){
        waitForSeconds(5);
        getWebElement(editmap.get("navigateright")).click();
    }
    public void strategyOwnerDays(String unit,String strategydays){
        getWebElement(planmap.get("strategyplanning")).click();
        Select oSelect = new Select(getWebElement(planmap.get("strategyownerdropdown")));
        oSelect.selectByVisibleText("Kedar Bhingare, SE");
        waitForSeconds(2);
        getWebElement(planmap.get("measurementTypeboolean")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("measurementTypecontinuos")).click();
        getWebElement(planmap.get("measurementunit")).sendKeys(unit);
        for(int i=0;i<=2;i++)
        {
            getWebElement(planmap.get("addnewmeasurement")).click();
        }
        waitForSeconds(2);
        getWebElement(planmap.get("plannedstrategydays")).clear();
        getWebElement(planmap.get("plannedstrategydays")).sendKeys(strategydays);
        waitForSeconds(2);
        getWebElement(planmap.get("savestrategydetails")).click();
        waitForSeconds(2);
    }
    public void tacticStatusInProgress(String checklist){
        getWebElement(planmap.get("tacticplanning")).click();
        Select oSelect1 = new Select(getWebElement(planmap.get("tacticowner")));
        oSelect1.selectByVisibleText("Kedar Bhingare, SE");
        waitForSeconds(2);
        Select oSelect2 = new Select(getWebElement(planmap.get("tacticstatus")));
        oSelect2.selectByVisibleText("In Progress");
        waitForSeconds(2);
        getWebElement(planmap.get("prerequisites")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("startnodeasap")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("checklist")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("addnewchecklist")).click();
        getWebElement(planmap.get("checklistname")).sendKeys(checklist);
        getWebElement(planmap.get("checkall")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("tacticdetails")).click();
        getWebElement(planmap.get("savetacticdetails")).click();
        waitForSeconds(2);
    }
    public void tacticStatusCompleted()
    {
        getWebElement(planmap.get("tacticplanning")).click();
        Select oSelect2 = new Select(getWebElement(planmap.get("tacticstatus")));
        oSelect2.selectByVisibleText("Completed");
        waitForSeconds(2);
        getWebElement(planmap.get("savetacticdetails")).click();
        waitForSeconds(2);
    }
    public void strategyStatusAchieved(String strategyNotes){
        getWebElement(planmap.get("strategyplanning")).click();
        getWebElement(planmap.get("strategyAchievedCheckbox")).click();
        waitForSeconds(2);
        getWebElement(planmap.get("strategyNotes")).sendKeys(strategyNotes);
        getWebElement(planmap.get("savestrategydetails")).click();
        waitForSeconds(2);
    }

}
