import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class ReviewByExpert {

    @Test
    public void reviewExpert(){
        VaildationModule  expertreview = new VaildationModule();
        expertreview.reviewExpert();
    }
}
