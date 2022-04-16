package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.Answer;
import kg.megacom.test_app.models.Language;
import kg.megacom.test_app.models.Test;
import kg.megacom.test_app.services.AnswerService;
import kg.megacom.test_app.services.LanguageService;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class TestController {

    @Autowired
    private LanguageService languageService;

    @Autowired
    private AnswerService answerService;


    @Autowired
    private TestService testService;

    @GetMapping("/save/lang")
    public String testSaveLang(){
        Language language = new Language();
        language.setName("Python");

        Language savedLang = languageService.save(language);
        return savedLang.getName();

    }
    @GetMapping("/save/change")
    public String testSaveChange(){

        Language language = languageService.findById(2L);
        System.out.println(language.is_active());
        //language.set_active(false);

        Language updatedLanguage = languageService.delete(language);
        System.out.println(updatedLanguage.is_active());
        return updatedLanguage.getName();
    }

    @GetMapping("/save/test")
    public String testSaveTest(){
        Test test = new Test();
        test.setName("Javascript Junior Front-End Developer");
        test.setNavi_user("Amantur");

        Test savedTest = testService.save(test);

        return savedTest.getName();
    }
}
