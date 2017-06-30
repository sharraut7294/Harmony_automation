import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class DefineGroups {
    @Test
    public void defineGroups(){
        DesignModule group = new DesignModule();
        /*for(int i=0;i<=1;i++)
        {
            group.navigateDown();
            group.navigateRight();
            group.navigateRight();
            group.deleteParentNodeMultipleChild();
        }*/
        group.defineGroups("Test Group 1");
    }
}
