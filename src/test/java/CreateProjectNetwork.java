import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 26/7/17.
 */
public class CreateProjectNetwork {
    @Test
    public void projectNetwork(){
        PlanningModule network = new PlanningModule();
        network.createProjectNetwork();
    }
}
