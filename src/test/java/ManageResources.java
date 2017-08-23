import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 24/7/17.
 */
public class ManageResources  {
    @Test
    public void addResources(){
        PlanningModule addresource = new PlanningModule();
        addresource.addResources("Kedar","Bhingare","kedar.bhingare@forgeahead.io","908","SE","150");


    }
}
