import org.testng.annotations.Test;
import pages.DesignModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class UseAsTemplate {
    @Test
    public void useTemplate(){
        DesignModule template = new DesignModule();
        template.useAsTemplate();
    }
}
