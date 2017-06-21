import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class CloseNodeDetails{
    @Test
    public void closeDetails(){
        NodeDetailsPage close = new NodeDetailsPage();
        close.closeDetails();
    }
}
