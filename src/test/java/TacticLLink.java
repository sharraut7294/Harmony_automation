import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 22/6/17.
 */
public class TacticLLink {
    @Test
    public void manageLinkTactic(){
        NodeDetailsPage tacticlink = new NodeDetailsPage();
        tacticlink.tacticLinkedFiles("youtube.com");
    }
}
