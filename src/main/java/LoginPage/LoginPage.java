package LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy (css = "#login")
    private WebElement  login;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#btLogin")
    private WebElement btLogin;

    @FindBy(css = "#titlerow .logo")
    private WebElement logo;

    public LoginPage() {
        PageFactory.initElements(Singlton.getDriver(), this);
    }

    public WebElement getLogin()    { return login;     }
    public WebElement getBtLogin()  { return btLogin;   }
    public WebElement getPassword() { return password;  }
    public WebElement getLogo()     { return logo;      }
}
