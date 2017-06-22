import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class DeleteChild {
    @Test
    public void deleteChild(){
        DesignModule delchild = new DesignModule();
        delchild.navigateUp();
        delchild.navigateLeft();
        delchild.navigateDown();
        delchild.navigateDown();
        delchild.deleteChildNode();
    }
}
