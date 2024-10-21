package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import steps.LoginStep;
import steps.RegistrationStep;

import java.util.List;
import java.util.Map;

public class BaseTest {
    protected LoginStep loginStep;
    protected RegistrationStep registrationStep;

    @BeforeEach
    public void setup() {
      // WebDriverManager.chromedriver().setup();
        //Allure.addAttachment("Дата запуска", getDate());
       //Allure.addAttachment("Браузер", getBrowser());
        Configuration.reportsFolder = "target/screenshoots/";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.browser = "chrome";
        Configuration.browserCapabilities.setCapability("goog:chromeOptions", Map.of(
                "args", List.of("--incognito")));
loginStep = new LoginStep();
registrationStep = new RegistrationStep();

    }
}