package lesson1;

import lesson1.services.SimpleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");

        SimpleService bean = context.getBean(SimpleService.class);
        System.out.println(bean.getTestService());
    }
}
