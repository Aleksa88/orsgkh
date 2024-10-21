package steps;

import baseEntities.BaseStep;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationStep extends BaseStep {
    public void registration (String telNumb) {
        open("https://ors:911@ors.gkh911.ru/app/auth/login");
        registrationPage.getSignUpLink().click();
        registrationPage.getTelNumb().setValue(telNumb);
        registrationPage.getSubmitButton().click();
    }
}