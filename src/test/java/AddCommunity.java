import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class AddCommunity {
    @Test
    public void addCommunity(){
        DesignModule community = new DesignModule();
        community.addCommunity();
    }
}
