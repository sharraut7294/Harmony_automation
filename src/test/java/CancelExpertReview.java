import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 3/7/17.
 */
public class CancelExpertReview {
    @Test
    public void cancelExpertReview(){
        VaildationModule cancel = new VaildationModule();
        cancel.cancelReview();
    }
}
