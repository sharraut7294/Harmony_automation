import org.testng.annotations.Test;
import pages.StrategyDashboard;


/**
 * Created by sharvari on 13/6/17.
 */

public class TestTree extends BaseTestScript{

    @Test
    public void tree() {
        StrategyDashboard tree = new StrategyDashboard();
        tree.createTree("New Tree by automation");
    }

}
