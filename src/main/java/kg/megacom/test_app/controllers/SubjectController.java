package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.LanguageService;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;
//    @Autowired
//    private LanguageService languageService;

    @PostMapping("/save")
    public SubjectDto save(@RequestBody SubjectDto subjectDto){
        return subjectService.save(subjectDto);
    }

    @GetMapping("/get")
    public SubjectDto findByID(@RequestParam Long id){
        return subjectService.findById(id);
    }

    @PutMapping("/update")
    public SubjectDto update(@RequestBody SubjectDto subjectDto){
        return subjectService.update(subjectDto);
    }

    @PutMapping("/delete")
    public SubjectDto delete(@RequestBody SubjectDto subjectDto){
        return subjectService.delete(subjectDto);
    }

//    @GetMapping("/findAllByLanguage")
//    public List<SubjectDto> findAllByLanguage(@RequestParam Long languageId){
//        LanguageDto languageDto = languageService.findById(languageId);
//        return subjectService.findAllByLanguage(languageDto);
//    }



}
