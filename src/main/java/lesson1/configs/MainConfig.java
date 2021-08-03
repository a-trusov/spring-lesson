package lesson1.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"lesson1.dao", "lesson1.services"})
public class MainConfig {

}
