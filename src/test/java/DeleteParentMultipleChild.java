import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class DeleteParentMultipleChild {
    @Test
    public void deleteParent(){
        int i;
        DesignModule parentdel = new DesignModule();
        parentdel.navigateDown();
        parentdel.navigateRight();
        parentdel.deleteParentNodeMultipleChild();
        for(i=0;i<=2;i++)
        {
            parentdel.undoAction();
        }
        //parentdel.saveChanges();
    }
}


