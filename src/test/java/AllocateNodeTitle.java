import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 8/8/17.
 */
public class AllocateNodeTitle {
    @Test
    public void changeTitle(){
        PlanningModule title = new PlanningModule();
        title.allocateTitle("Test Automated Parent node");

    }
}
