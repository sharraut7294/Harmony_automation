import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class RedoAction {
    @Test
    public void redo(){
        DesignModule redoaction = new DesignModule();
        redoaction.redoAction();
    }
}
