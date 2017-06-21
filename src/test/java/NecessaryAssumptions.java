import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class NecessaryAssumptions {
    @Test
    public void necessaryAssumptions(){
        NodeDetailsPage assumption1 = new NodeDetailsPage();
        assumption1.addNecessaryAssumptions("Necessary Assumption 1");
    }
}
