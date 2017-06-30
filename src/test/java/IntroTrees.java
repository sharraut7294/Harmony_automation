import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class IntroTrees {
    @Test
    public void introTrees(){
        VaildationModule intro = new VaildationModule();
        intro.introToTrees();
        intro.navigateNormalTree();
    }
}
