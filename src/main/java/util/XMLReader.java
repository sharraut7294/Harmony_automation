package util;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.sun.xml.internal.ws.server.ServerRtException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



/**
 * Created by sharvari on 14/6/17.
 */
public class XMLReader
{

        //XMLReader xmlReader=new XMLReader();
       /* Map<String,String>map=xmlReader.getObjectRepoData("loginpage");
        System.out.println("LocatorType : "+map.get("Login_home").split("_TBD_")[0]);
        System.out.println("LocatorValue : "+map.get("Login_home").split("_TBD_")[1]);*/


    public Map<String,String> getObjectRepoData(String fileName){
        Map<String,String> objectMap=new HashMap<String, String>();
        try {
            File xmlFile = new File("src/main/resources/ObjectRepo/"+fileName+".xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Element");
            for (int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    objectMap.put(eElement.getAttribute("name"),eElement.getAttribute("locatorType")+"_TBD_"+eElement.getAttribute("locatorValue"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return objectMap;
    }
}



