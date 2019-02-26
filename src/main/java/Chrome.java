import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c://PF//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-trading.umarkets.com/");
        driver.findElement(By.cssSelector("#login")).sendKeys("elinac@123software.ru");
        driver.findElement(By.cssSelector("#password")).sendKeys("password123");
        driver.findElement(By.cssSelector("#btLogin")).click();
        Thread.sleep(15000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#titlerow .logo")).isDisplayed());
    }

}