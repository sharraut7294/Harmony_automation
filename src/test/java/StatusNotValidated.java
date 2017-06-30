import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class StatusNotValidated {
    @Test
    public void notValidate(){
        VaildationModule notvalid = new VaildationModule();
        notvalid.statusNotValidated();
        notvalid.statusValidated();
    }
}
