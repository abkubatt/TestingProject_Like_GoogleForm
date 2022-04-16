package kg.megacom.test_app;

import kg.megacom.test_app.models.Language;
import kg.megacom.test_app.models.Question;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestAppApplication.class, args);



    }

}
