package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.Getter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
@Getter
@Data

public class RegistrationPage {
    private final SelenideElement signUpLink = $(byText("Зарегистрироваться"));
    private final SelenideElement telNumb = $(".ctext-muted.mt-3.text-center");
    private final SelenideElement submitButton = $("button").shouldHave(text("Продолжить"));

}
