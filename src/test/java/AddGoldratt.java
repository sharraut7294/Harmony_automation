import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class AddGoldratt {
    @Test
    public void goldrattTree(){
        DesignModule goldratt = new DesignModule();
        goldratt.addGoldratt();
    }
}
