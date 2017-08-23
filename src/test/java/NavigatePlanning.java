import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 26/7/17.
 */
public class NavigatePlanning {
    @Test
    public void navigatePlanning(){
        PlanningModule plan = new PlanningModule();
        plan.navigatePlanning();
    }
}
