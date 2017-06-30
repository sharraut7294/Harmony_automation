import org.testng.annotations.Test;
import pages.VaildationModule;

/**
 * Created by sharvari on 26/6/17.
 */
public class ExcelExport {

    @Test
    public void excelExport(){
        VaildationModule exportexcel = new VaildationModule();
        exportexcel.excelExport();
    }
}
