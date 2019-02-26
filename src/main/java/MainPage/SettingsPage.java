package MainPage;

import Drivers.Singlton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
    @FindBy (css = "#login")
    private WebElement  login;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#btLogin")
    private WebElement btLogin;

    public SettingsPage() {
        PageFactory.initElements(Singlton.getDriver(), this);
    }

    public WebElement getLogin()    { return login;     }
    public WebElement getBtLogin()  { return btLogin;   }
    public WebElement getPassword() { return password;  }
}
