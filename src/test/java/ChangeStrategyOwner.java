import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 10/8/17.
 */
public class ChangeStrategyOwner {
    @Test
    public void strategyOwner(){
        PlanningModule strategy = new PlanningModule();
        for(int i=0;i<2;i++) {
            strategy.navigateDown();
        }
        strategy.strategyOwnerDays("days","13.44455");
    }
}
