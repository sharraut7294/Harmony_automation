import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 14/8/17.
 */
public class StrategyAchieved {
    @Test
    public void strategyAchieve(){
        PlanningModule strategy = new PlanningModule();
        for(int i=0;i<2;i++) {
            strategy.navigateDown();
        }
        strategy.strategyStatusAchieved("Test Strategy Notes");
    }
}
