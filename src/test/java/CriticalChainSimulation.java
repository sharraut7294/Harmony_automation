import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 26/7/17.
 */
public class CriticalChainSimulation {
    @Test
    public void criticalChain(){
        PlanningModule simulation = new PlanningModule();
        simulation.criticalChainSimulation();
    }
}
