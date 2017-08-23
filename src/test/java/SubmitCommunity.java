import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 3/7/17.
 */
public class SubmitCommunity {
    @Test
    public void submitCommunity(){
        VaildationModule community = new VaildationModule();
        community.navigateValidation();
        community.submitCommunity();
    }
}
