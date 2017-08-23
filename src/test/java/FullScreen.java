import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 3/7/17.
 */
public class FullScreen {
    @Test
    public void treeFullScreen(){
        VaildationModule full = new VaildationModule();
        full.navigateValidation();
        full.fullScreen();
        full.deactivateFullscreen();
    }
}
