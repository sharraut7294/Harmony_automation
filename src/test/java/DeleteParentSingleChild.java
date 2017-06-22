import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class DeleteParentSingleChild {
    @Test
    public void deleteParentWithChild(){
        DesignModule delparent = new DesignModule();
        delparent.navigateDown();
        delparent.deleteParentSingleChild();
    }
}
