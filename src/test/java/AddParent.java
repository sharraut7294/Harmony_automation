import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 20/6/17.
 */
public class AddParent extends BaseTestScript {
    @Test
    public void parentAdd(){
        DesignModule parent = new DesignModule();
        parent.navigateUp();
        parent.navigateRight();
        parent.addParent("Parent2");
        parent.addChild("Child 5");
    }
}
