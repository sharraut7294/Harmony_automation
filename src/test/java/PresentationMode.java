import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class PresentationMode{
    @Test
    public void presentationMode(){
        NodeDetailsPage nodefullscreen = new NodeDetailsPage();
        nodefullscreen.presentationMode();
    }
}
