import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 14/8/17.
 */
public class TacticCompleted {
    @Test
    public void tacticStatusCompleted(){
        PlanningModule tacticComplete = new PlanningModule();
        for(int i=0;i<2;i++) {
            tacticComplete.navigateDown();
        }
        tacticComplete.tacticStatusCompleted();

    }
}
