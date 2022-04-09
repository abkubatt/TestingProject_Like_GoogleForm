package kg.megacom.test_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestAppApplication.class);
        for (String s: applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
        //SpringApplication.run(TestAppApplication.class, args);

    }

}
