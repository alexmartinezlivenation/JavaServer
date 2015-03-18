package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.context.embedded.*;

import java.lang.Override;



@RestController
public class SampleController {

    private static class MyCustomizer implements EmbeddedServletContainerCustomizer {
        @Override
        public void customize(ConfigurableEmbeddedServletContainer container) {
            container.setPort(9002);
        }
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return new MyCustomizer();
    }
}