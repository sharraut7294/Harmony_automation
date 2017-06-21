import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 20/6/17.
 */
public class AddChild {
    @Test
    public void addChild(){
        DesignModule child = new DesignModule();
        child.addChild("Child 1");
        child.navigateUp();
        child.addChild("Child 2");
        child.navigateLeft();
        child.addChild("Child 3");
        child.navigateUp();
        child.addChild("Child 4");
     }
}
