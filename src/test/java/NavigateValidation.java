import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class NavigateValidation {

    @Test
    public void validation(){
        VaildationModule validate = new VaildationModule();
        validate.navigateValidation();
    }
}
