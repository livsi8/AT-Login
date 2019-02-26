package Steps;

import MainPage.MainPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Drivers.Singlton.getDriver;

public class MainPageSteps {
    public static MainPage mp;
    static WebDriver driver = getDriver();

    @And("^I wait (\\d*) ms and chack LOGO$")
    public void iWaitMsAndChackLogo(Integer ms) throws InterruptedException {
        mp = new MainPage();

        Thread.sleep( (long)ms);
        Assert.assertTrue(mp.getLogo().isDisplayed());
    }

    @And("^I click economicalNews$")
    public void iClickEconomicalNews() throws InterruptedException {
        Thread.sleep(1000);
        new MainPage().getEconomicalNews().click();

        // Явное ожидание
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions
                .visibilityOf(new MainPage().getEconomicItem()));

        // Не явное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(new MainPage().getEconomicItem().isDisplayed());
    }

    @And("^I close page$")
    public void iClosePage() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}
