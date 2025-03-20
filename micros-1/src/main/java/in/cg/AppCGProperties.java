package in.cg;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "cg")
public class AppCGProperties {

    private String env;
    private String name;
    private String version;
    private String author;

}
