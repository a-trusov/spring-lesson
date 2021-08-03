package lesson1.configs;

import lesson1.dao.SimpleDAO;
import lesson1.dao.SimpleDAOImpl;
import lesson1.services.SimpleService;
import lesson1.services.SimpleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public SimpleDAO getDAO() {
        return new SimpleDAOImpl();
    }

    @Bean
    public SimpleService getService() {
        SimpleService service = new SimpleServiceImpl(getDAO());
        return service;
    }
}
