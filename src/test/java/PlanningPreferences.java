import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 26/7/17.
 */
public class PlanningPreferences {
    @Test
    public void planningPrefrences(){
        PlanningModule planpreference = new PlanningModule();
        planpreference.changePrefrences("40","60","5","10");
    }
}
