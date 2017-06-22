import org.testng.annotations.Test;
import pages.NodeDetailsPage;
import util.BrowserDriver;

/**
 * Created by sharvari on 22/6/17.
 */
public class TacticPlanningNodeDetails {
    @Test
    public void tacticPlan(){
        NodeDetailsPage tacticplan = new NodeDetailsPage();
        tacticplan.tacticPlanning();
        tacticplan.saveTacticPlanning();
        BrowserDriver.navigateBack();
        BrowserDriver.navigateBack();
    }
}
