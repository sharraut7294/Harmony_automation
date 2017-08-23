import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 10/8/17.
 */
public class TacticStausIP {
    @Test
    public void tacticStatus(){
        PlanningModule tactic = new PlanningModule();
        for(int i=0;i<2;i++) {
            tactic.navigateDown();
        }
        tactic.tacticStatusInProgress("Test Checklist");
    }
}
