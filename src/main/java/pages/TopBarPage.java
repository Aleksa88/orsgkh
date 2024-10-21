package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class TopBarPage {
    public SelenideElement username = $(".d-none.d-lg-inline-flex.ms-2.text-truncate");

}
