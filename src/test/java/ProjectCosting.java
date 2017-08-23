import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 10/8/17.
 */
public class ProjectCosting {
    @Test
    public void projectCost(){
        PlanningModule cost = new PlanningModule();
        cost.projectCosting();
    }
}
