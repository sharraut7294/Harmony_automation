import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 3/7/17.
 */
public class FinancialModel {
    @Test
    public void financialModel(){
        VaildationModule financial = new VaildationModule();
        financial.financialModel();
    }
}
