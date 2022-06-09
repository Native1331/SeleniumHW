
import config.WebConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    public static void beforeTest() {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        if (!webConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webConfig.getRemoteWebDriver();
        }
        String baseUrlString = System.getProperty("baseUrl");
        if (baseUrlString == null) {
            baseUrlString = "https://github.com";
        }
        Configuration.baseUrl = baseUrlString;
    }
}