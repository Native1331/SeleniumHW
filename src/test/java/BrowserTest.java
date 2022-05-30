import config.ChromeConfig;
import config.FirefoxConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BrowserTest {
    @Test
    public void testChromeBrowser() {
        // проходит в случае запуска из консоли
        // ./gradlew clean test --tests BrowserTest -Ddevice=chrome
        ChromeConfig config = ConfigFactory
                .create(ChromeConfig.class, System.getProperties());

        assertThat(config.browser1()).isEqualTo("Chrome");
        assertThat(config. browserVersion1()).isEqualTo("5.0");
        assertThat(config. localDriver1()).isEqualTo("https://github.com");
    }

    @Test
    public void testFirefoxBrowser() {
        // проходит в случае запуска из консоли
        // ./gradlew clean test --tests BrowserTest -Ddevice=firefox
        FirefoxConfig config = ConfigFactory
                .create(FirefoxConfig.class, System.getProperties());

        assertThat(config.browserVersion2()).isEqualTo("Firefox");
        assertThat(config.browserVersion2()).isEqualTo("100");
        assertThat(config.remoteDriver2()).isEqualTo("https://localhost:4444/wd/hub");
    }


}
