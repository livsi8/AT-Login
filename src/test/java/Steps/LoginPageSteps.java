package Steps;

import LoginPage.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Drivers.Singlton.getDriver;


public class LoginPageSteps extends Steps {

    public static LoginPage lp;
    static  WebDriver driver = getDriver();

    @Before
    public void setUp(){
        lp = new LoginPage();
    }

    @Given("^I go to server (.*)$")
    public void iGoToServer(String url) {
//        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("^I put ([^\"]*) as login$")
    public void iPutIntoLogin(String login) throws InterruptedException {
        lp.getLogin().sendKeys(login);
    }


    @And("^I put ([^\"]*) as password$")
    public void iPutIntoPassword(String password) {
        lp.getPassword().sendKeys(password);
    }

    @And("^I press LoginPage button$")
    public void iPressLoginPageButton() {
        lp.getBtLogin().click();

        try {
            new WebDriverWait(getDriver(), 60).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#btLogin")));
            new WebDriverWait(getDriver(), 30).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#forBlur")));
            new WebDriverWait(getDriver(), 30).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ui-widget-overlay")));
        } catch (Exception e) {
        }
    }
}
