import config.ApiTokenConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;


public class ApiTokenTest {
    @Test
    public void testClasspath() {
        ApiTokenConfig config = ConfigFactory.create(ApiTokenConfig.class, System.getProperties());

        assertThat(config.login()).isEqualTo("kadyshevani@gmail.com");
        assertThat(config.password()).isEqualTo("nata131984");
    }

    @Test
    public void testLocalFile() throws IOException {
        // вот это будет происходить в Jenins, вы к этому не имеете доступа
        String content = "login = secret-login\npassword = secret-pass";
        Path propsPath = Paths.get("/Temp/secret.properties");
        Files.write(propsPath, content.getBytes(StandardCharsets.UTF_8));
        // вот это будет происходить в Jenins, вы к этому не имеете доступа

        ApiTokenConfig config = ConfigFactory
                .create(ApiTokenConfig.class, System.getProperties());
        assertThat(config.login()).isEqualTo("secret-login");
        assertThat(config.password()).isEqualTo("secret-pass");
        Files.delete(propsPath);
    }
}