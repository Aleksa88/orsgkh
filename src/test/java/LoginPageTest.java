import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void authTest() {
        loginStep.auth("+79531636139", "Secret1.");
    }
}
