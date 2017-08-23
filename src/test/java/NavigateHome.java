import org.testng.annotations.Test;
import pages.TreeEditor;

/**
 * Created by sharvari on 3/7/17.
 */
public class NavigateHome {
    @Test
    public void navigateHome(){
        TreeEditor homebutton = new TreeEditor();
        homebutton.navigateHome();
    }
}
