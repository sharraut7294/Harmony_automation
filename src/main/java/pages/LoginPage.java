package pages;

import util.GuiControl;
import util.XMLReader;
import java.util.Map;

/**
 * Created by sharvari on 15/6/17.
 */
public class LoginPage extends GuiControl {

    Map<String,String>logmap = new XMLReader().getObjectRepoData("loginpage");

    public void successfulLogin(String username, String password) {
        getWebElement(logmap.get("Login_home")).click();
        getWebElement(logmap.get("username")).sendKeys(username);
        getWebElement(logmap.get("password")).sendKeys(password);
        getWebElement(logmap.get("loginbutton")).submit();
    }
    public void forgotPassword(String email){
        getWebElement(logmap.get("Login_home")).click();
        getWebElement(logmap.get("forgotpassword")).click();
        getWebElement(logmap.get("forgotpassemail")).sendKeys(email);
        getWebElement(logmap.get("sendbutton")).submit();
    }
    public void translateLanguage(){
        getWebElement(logmap.get("languageselect")).click();
    }
    public void switchTranslationOff(){
        getWebElement(logmap.get("switchtranslationoff")).click();
    }
    public void unsuccessfulLogin(String username, String password){
        getWebElement(logmap.get("Login_home")).click();
        getWebElement(logmap.get("username")).sendKeys(username);
        getWebElement(logmap.get("password")).sendKeys(password);
        getWebElement(logmap.get("loginbutton")).submit();


    }
}
