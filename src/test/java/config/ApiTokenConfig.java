package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/Temp/secret.properties",
        "classpath:secret.properties"
})
public interface  ApiTokenConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();
}