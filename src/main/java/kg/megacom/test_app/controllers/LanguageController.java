package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping("/save")
    public LanguageDto save(@RequestBody LanguageDto languageDto){
        return languageService.save(languageDto);
    }
    @GetMapping("/get")
    public LanguageDto findById(@RequestParam Long id){
        return languageService.findById(id);
    }
    @GetMapping("/list")
    public List<LanguageDto> findAllByActive(){
        return languageService.findAllByActive();
    }
    @PutMapping("/update")
    public LanguageDto update(@RequestBody LanguageDto languageDto){
        return languageService.update(languageDto);
    }

    @PutMapping("/delete")
    public LanguageDto delete(@RequestBody LanguageDto languageDto){
        return languageService.delete(languageDto);
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
