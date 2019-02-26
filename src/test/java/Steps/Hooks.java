package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static Drivers.Singlton.getDriver;

public class Hooks {

    @Before
    public void setUp(){

    }

    @After
    public void cleanUp(){
//        getDriver().close();
//        getDriver().quit();
    }
}
