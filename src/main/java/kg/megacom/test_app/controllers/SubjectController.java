package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/save")
    public String toSaveSubject(){
        SubjectDto subject = new SubjectDto();
        subject.set_active(true);
        subject.setDescription("OOP");
        subject.setLanguage(new LanguageDto());
        subject.setTitle("OOP");

        SubjectDto savedSubject = subjectService.save(subject);
        return savedSubject.getTitle();
    }
}
