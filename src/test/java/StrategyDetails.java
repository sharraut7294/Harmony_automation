import org.testng.annotations.Test;
import pages.DesignModule;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class StrategyDetails{
    @Test
    public void addStrategy(){
        NodeDetailsPage strategy = new NodeDetailsPage();
        strategy.addStrategyDetails("Strategy 1");
    }

}
