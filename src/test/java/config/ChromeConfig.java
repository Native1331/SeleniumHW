
  package config;

import org.aeonbits.owner.Config;

    @Config.Sources({
            "classpath:chrome.properties"
    })
    
    public interface ChromeConfig extends Config {

        @Key("browser1")
        String browser1();

        @Key("browser.version1")
        String browserVersion1 ();

        @Key("Local.driver1")
        String localDriver1();

    }

