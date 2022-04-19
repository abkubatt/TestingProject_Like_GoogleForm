package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/save")
    public String testSaveLanguage(){
        Language language = new Language();
        language.setName("Java");
        Language savedLang = languageService.save(language);
        return savedLang.getName();
    }
//    @GetMapping("/findAllByIs_activeIsTrue")
//    public List<Language> toFindAllByIs_activeIsTrueLanguage(){
//        List<Language> findAllByIs_activeIsTrueLanguage = languageService.findAllByIs_activeIsTrue();
//        return findAllByIs_activeIsTrueLanguage;
//    }

    //    @GetMapping("/findAllBy_activeTrue")
//    public List<Language> findAllBy_activeTrueLanguage(){
//       List<Language> findAllBy_activeTrueLanguage = languageService.findAllBy_activeTrue();
//       return findAllBy_activeTrueLanguage;
//    }




//    @GetMapping("/save/change")
//    public String testSaveChange(){
//
//        Language language = languageService.findById(2L);
//        System.out.println(language.is_active());
//        //language.set_active(false);
//
//        Language updatedLanguage = languageService.delete(language);
//        System.out.println(updatedLanguage.is_active());
//        return updatedLanguage.getName();
//    }
}
