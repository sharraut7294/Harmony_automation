package util;

/**
 * Created by sharvari on 14/6/17.
 */
public class BrowserDriver {

    public static void startBrowser(String browserName){
        GuiControl.setWebDriver(browserName);
    }

    public static void accessUrl(String url){
        GuiControl.getWebDriver().get(url);
    }

    public static void maximizeBrowser(){
        GuiControl.getWebDriver().manage().window().maximize();
    }
    public static void closeBrowser(){
        GuiControl.getWebDriver().close();
    }

    public static void stopBrowser(){
        GuiControl.getWebDriver().quit();
    }
}
