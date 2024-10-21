package baseEntities;

import pages.LoginPage;
import pages.RegistrationPage;
import pages.TopBarPage;

public class BaseStep {
    protected TopBarPage topBarPage;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;

    public BaseStep() {
        loginPage = new LoginPage();
        topBarPage = new TopBarPage();
        registrationPage = new RegistrationPage();

    }
}