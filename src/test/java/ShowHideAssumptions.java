import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class ShowHideAssumptions{
    @Test
    public void ShowHideAssumptions(){
        NodeDetailsPage showhide = new NodeDetailsPage();
        showhide.showHideAssumptions();
        showhide.showHideAssumptions();
    }
}
