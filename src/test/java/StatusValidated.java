import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class StatusValidated {
    @Test
    public void changeStatusV(){
        VaildationModule statusv = new VaildationModule();
        statusv.navigateRight();
        statusv.navigateDown();
        statusv.navigateRight();
        statusv.statusValidated();
    }
}
