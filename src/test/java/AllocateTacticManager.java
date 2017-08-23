import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 8/8/17.
 */
public class AllocateTacticManager {
    @Test
    public void changeTacticManager(){
        PlanningModule tacticmanager = new PlanningModule();
        tacticmanager.allocateTacticManager();
    }
}
