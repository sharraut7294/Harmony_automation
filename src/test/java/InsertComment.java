import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class InsertComment {
    @Test
    public void insertComment(){
        VaildationModule comment = new VaildationModule();
        comment.navigateDown();
        comment.insertComment("Test comment on child node 1");
    }
}
