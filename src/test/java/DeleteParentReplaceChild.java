import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class DeleteParentReplaceChild {
    @Test
    public void replaceChild(){
        DesignModule replacechild = new DesignModule();
        replacechild.navigateDown();
        replacechild.deleteParentReplaceChild();
    }
}
