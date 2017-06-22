import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class DeleteParentMultipleChild {
    @Test
    public void deleteParent(){
        DesignModule parentdel = new DesignModule();
        parentdel.navigateDown();
        parentdel.navigateRight();
        parentdel.deleteParentNodeMultipleChild();
    }
}


