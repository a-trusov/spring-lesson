package lesson1;

import lesson1.configs.MainConfig;
import lesson1.services.SimpleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        SimpleService bean = context.getBean(SimpleService.class);
        System.out.println(bean.getTestService());
    }
}
