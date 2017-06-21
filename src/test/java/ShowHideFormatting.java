import org.testng.annotations.Test;
import pages.NodeDetailsPage;

/**
 * Created by sharvari on 21/6/17.
 */
public class ShowHideFormatting{
    @Test
    public void showFormat(){
        NodeDetailsPage format = new NodeDetailsPage();
        format.showFormatting();
        format.hideFormatting();
    }
}
