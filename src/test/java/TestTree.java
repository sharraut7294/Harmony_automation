import org.testng.annotations.Test;
import pages.StrategyDashboard;
import pages.TreeEditor;
import util.BrowserDriver;


/**
 * Created by sharvari on 13/6/17.
 */

public class TestTree extends BaseTestScript{

    @Test
    public void tree() {
        StrategyDashboard tree = new StrategyDashboard();
        tree.createTree("Tree created using Selenium");

        TreeEditor childnode = new TreeEditor();
        childnode.addChild("Child1");
        childnode.addGoldratt();
        childnode.addCommunity();
    }

    /*@Test
    public void sharetree(){
        StrategyDashboard select = new StrategyDashboard();
        select.selectTree();
        select.shareTree("sharvari.raut+10@forgeahead.io","Sharvari");
    }*/


}
