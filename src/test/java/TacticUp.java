import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class TacticUp{
    @Test
    public void tacticUp(){
        NodeDetailsPage tacticup = new NodeDetailsPage();
        tacticup.tacticUp();
    }
}
