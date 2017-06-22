import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 22/6/17.
 */
public class UndoAction {
    @Test
    public void undo(){
        DesignModule undoaction = new DesignModule();
        undoaction.undoAction();
    }
}
