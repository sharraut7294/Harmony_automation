import org.testng.annotations.Test;
import pages.PlanningModule;

/**
 * Created by sharvari on 26/7/17.
 */
public class ProjectGanttChart {
    @Test
    public void ganttChart(){
        PlanningModule chart = new PlanningModule();
        chart.ganttChart();
    }
}
