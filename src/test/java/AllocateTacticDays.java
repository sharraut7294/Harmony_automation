import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 4/8/17.
 */
public class AllocateTacticDays {
    @Test
    public void tacticDays(){
        PlanningModule tactic = new PlanningModule();
        tactic.allocateTacticDays("5.6666");
    }
}
