import org.testng.annotations.Test;
import pages.StrategyDashboard;

/**
 * Created by sharvari on 20/6/17.
 */
public class CreateTree extends BaseTestScript {
    @Test
    public void createST(){
        StrategyDashboard tree = new StrategyDashboard();
        tree.createTree("Test New tree on 20 june");
    }
}
