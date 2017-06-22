import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class ParallelAssumptions{
    @Test
    public void parallelAssumptions(){
        NodeDetailsPage parallel = new NodeDetailsPage();
        parallel.tacticUp();
        parallel.parallelAssumptions("Viability Assumptions 1");

    }
}
