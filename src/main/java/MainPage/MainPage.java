package MainPage;

import LoginPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Drivers.Singlton.getDriver;


public class MainPage {
    @FindBy(css = "#titlerow .logo")
    private WebElement logo;

    @FindBy(css = "#service-economicalNews")
    private WebElement economicalNews;

    @FindBy(css = ".economic-item")
    private WebElement economicItem;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getLogo()     { return logo;      }
    public WebElement getEconomicalNews()       { return economicalNews; }
    public WebElement getEconomicItem()         { return economicItem;   }

    public SettingsPage goToSettingsPage(){
        getDriver().findElement(By.cssSelector("[data-at=\"at-header-settings-button\"]")).click();
        new WebDriverWait(getDriver(),10)
                .until(ExpectedConditions
                        .elementToBeClickable(
                                By.cssSelector("[data-at=\"at-settings-page-close-button\"]")
                        ));
        return new SettingsPage();
    }
}
