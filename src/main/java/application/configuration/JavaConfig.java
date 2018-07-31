package application.configuration;

import application.beans.Tires;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("application")
public class JavaConfig {

    @Bean
    public Tires getTires(){
        return new Tires();
    }
}
