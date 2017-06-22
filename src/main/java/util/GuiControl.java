package util;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by sharvari on 14/6/17.
 */
public class GuiControl {
    private static WebDriver webDriver;

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public static void setWebDriver(String browserName) {
        switch(browserName){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/lib/linux/chromedriver");
                webDriver = new ChromeDriver();
                break;

            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/lib/linux/geckodriver");
                webDriver = new FirefoxDriver();
                break;
        }
    }

    public WebElement getWebElement(String loc) {

        String locType = loc.split("_TBD_")[0];
        String locValue =loc.split("_TBD_")[1];
        WebElement element  = null;
        switch(locType){
            case "id":
                element = webDriver.findElement(By.id(locValue));
                break;

            case "linkText":
                element = webDriver.findElement(By.linkText(locValue));
                break;

            case "xpath":
                element = webDriver.findElement(By.xpath(locValue));
                break;

            case "name":
                element = webDriver.findElement(By.name(locValue));
                break;

            case "className":
                element = webDriver.findElement(By.className(locValue));
                break;

            case "tagName":
                element = webDriver.findElement(By.tagName(locValue));
                break;
        }
        return element;
    }
    public void waitForSeconds(int timeInSeconds){
        for (int i=0;i<timeInSeconds;i++)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
    }
    public void frame(String frameid){
        webDriver.switchTo().frame(frameid);
    }
    public void switchMain(){
        webDriver.switchTo().defaultContent();
    }
    public void alertPopup(){
        Alert confirmationalert = getWebDriver().switchTo().alert();
        confirmationalert.accept();

    }

}
