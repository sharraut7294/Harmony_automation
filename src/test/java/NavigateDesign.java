import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class NavigateDesign {
    @Test
    public void navigateToDesign(){
        DesignModule design = new DesignModule();
        design.navigateDesignModule();
    }
}
