package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Singlton {
    private static WebDriver instance;
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "c://PF//chromedriver.exe");
        if(instance == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            instance = new ChromeDriver(options);
        }
        return instance;
    }
}
