import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class SufficiencyAssumptions{
    @Test
    public void sufficiencyAssumptions(){
        NodeDetailsPage sufficiency = new NodeDetailsPage();
        sufficiency.tacticDown();
        sufficiency.sufficiencyAssumptions("Sufficiency Assumptions 1");

    }
}
