import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 21/6/17.
 */

public class NodeDetails{
    @Test
    public void nodeDetails(){
        DesignModule node = new DesignModule();
        node.navigateNodeDetails();
    }
}
