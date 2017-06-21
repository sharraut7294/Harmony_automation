import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class StrategyupArrow{
    @Test
    public void strategyUp(){
        NodeDetailsPage up = new NodeDetailsPage();
        up.strategyUp();
    }
}
