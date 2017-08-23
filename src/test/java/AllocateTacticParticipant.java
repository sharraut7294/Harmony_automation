import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 8/8/17.
 */
public class AllocateTacticParticipant {
    @Test
    public void tacticParticipant(){
        PlanningModule participant = new PlanningModule();
        participant.allocateTacticParticipant("15.6888");
    }
}
