package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlton {
    private static WebDriver instance;
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "c://PF//chromedriver.exe");
        if(instance == null){
            instance = new ChromeDriver();
        }
        return instance;
    }
}
