package Steps;

import LoginPage.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static LoginPage.Singlton.getDriver;


public class LoginPageSteps extends Steps {

    public static LoginPage lp;
    static  WebDriver driver = getDriver();

    @Before
    public void setUp(){
        lp = new LoginPage();
    }

    @After
    public void cleanUp(){}


    @Given("^I go to server (.*)$")
    public void iGoToServer(String url) {
        driver.manage().window().maximize();
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
    }

    @And("^I wait (\\d*) ms and chack LOGO$")
    public void iWaitMsAndChackLogo(Integer ms) throws InterruptedException {
        Thread.sleep(ms);
        Assert.assertTrue(lp.getLogo().isDisplayed());
    }
}
