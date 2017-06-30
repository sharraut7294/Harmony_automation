import org.testng.annotations.Test;
import pages.StrategyDashboard;

/**
 * Created by sharvari on 20/6/17.
 */
public class CreateTree{
    @Test
    public void createST(){
        StrategyDashboard tree = new StrategyDashboard();
        tree.createTree("Test Automated New tree on 30 june");
    }
}
