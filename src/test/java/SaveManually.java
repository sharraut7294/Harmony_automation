import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 20/6/17.
 */
public class SaveManually {
    @Test
    public void saveChanges(){
        DesignModule save = new DesignModule();
        save.saveChanges();
    }
}
