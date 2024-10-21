package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

@Getter
public class LoginPage  {
    private final SelenideElement telNumberField = $(By.name("login"));
    private final SelenideElement passwordField = $(By.name("password"));
    private final SelenideElement submitButton = $(".btn.btn-primary.w-100");



}