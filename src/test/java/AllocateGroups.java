import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class AllocateGroups {
    @Test
    public void allocateGroups(){
        DesignModule allocategroup = new DesignModule();
        allocategroup.allocateGroups();
        allocategroup.saveChanges();
    }
}
