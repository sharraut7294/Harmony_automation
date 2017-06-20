import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 20/6/17.
 */
public class ChangeNodeTitle extends BaseTestScript {
    @Test
    public void changeTitle(){
        DesignModule design = new DesignModule();
        design.changeTitle("Parent node");
    }
}
