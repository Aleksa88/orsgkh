package steps;

import baseEntities.BaseStep;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginStep extends BaseStep {

    public void auth(String telNumber, String psw) {
        open("https://ors:911@ors.gkh911.ru/app/auth/login");
        loginPage.getTelNumberField().setValue(telNumber);
        loginPage.getPasswordField().setValue(psw);
        loginPage.getSubmitButton().click();
        topBarPage.getUsername().shouldBe(visible);
    }
}