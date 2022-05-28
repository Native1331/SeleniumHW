package config;

import org.aeonbits.owner.Config;

public class CredentialConfig {
    @Config.Sources("classpath:resources/credential.properties")
    public interface CredentialsConfig extends Config {
        String selenoidLogin();
        String selenoidPassword ();
            }
}
