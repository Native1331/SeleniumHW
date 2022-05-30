package config;


import org.aeonbits.owner.Config;

        @Config.Sources({
        "classpath:firefox.properties"
        })

public interface FirefoxConfig extends Config {

        @Key("browser2")
        String browser2();

        @Key("browser.version2")
        String browserVersion2();

        @Key("remote.driver2")
        String remoteDriver2();

    }


