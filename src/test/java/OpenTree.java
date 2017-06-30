import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class OpenTree {
    @Test
    public void openTree(){
        DesignModule opentree = new DesignModule();
        opentree.openTree();
    }
}
