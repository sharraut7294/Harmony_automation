import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class StrategyLink{
    @Test
    public void strategyLink(){
        NodeDetailsPage link = new NodeDetailsPage();
        link.strategyLinkedFiles("harmonytoc.com");
    }
}
