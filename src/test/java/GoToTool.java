import org.testng.annotations.Test;
import pages.StrategyDashboard;

/**
 * Created by sharvari on 3/7/17.
 */
public class GoToTool {
    @Test
    public void goTool(){
        StrategyDashboard tool = new StrategyDashboard();
        tool.goToTool();
    }


}
