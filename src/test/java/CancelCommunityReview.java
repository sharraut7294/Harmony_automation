import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 3/7/17.
 */
public class CancelCommunityReview {
    @Test
    public void cancelCommunityReview(){
        VaildationModule cancelreview = new VaildationModule();
        cancelreview.cancelReview();
    }
}
