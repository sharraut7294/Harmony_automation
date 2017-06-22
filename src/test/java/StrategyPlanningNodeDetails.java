import org.testng.annotations.Test;
import pages.NodeDetailsPage;
import util.BrowserDriver;

/**
 * Created by sharvari on 22/6/17.
 */
public class StrategyPlanningNodeDetails {
    @Test
    public void strategyPlanning(){
        NodeDetailsPage strategyplan = new NodeDetailsPage();
        strategyplan.strategyPlanning();
        strategyplan.saveStrategyPlanning();
        BrowserDriver.navigateBack();
        BrowserDriver.navigateBack();
    }
}
