package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

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

    @PutMapping("/findAllByLanguage")
    public List<SubjectDto> findAllByLanguage(Language language){
        return null;
    }



}
