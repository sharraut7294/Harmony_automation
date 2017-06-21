import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class TacticDetails{
    @Test
    public void addTactic(){
        NodeDetailsPage tactic = new NodeDetailsPage();
        tactic.addTacticDetails("Tactic 1");
    }
}
