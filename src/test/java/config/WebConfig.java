package config;
import org.aeonbits.owner.Config;
import java.net.URL;

    @Config.Sources("classpath:config/${env}.properties")
    public interface WebConfig extends Config {

        @Key("remoteWebDriver")
        String getRemoteWebDriver();

        @Key("browser")
        @DefaultValue("CHROME")
        String getBrowser();

        @Key("browserVersion")
        @DefaultValue("5.0")
        String getBrowserVersion();

        @Key("baseUrl")
        @DefaultValue("https://github.com")
        String getBaseUrl();

        @Key("remoteUrl")
        URL getRemoteUrl();
}
