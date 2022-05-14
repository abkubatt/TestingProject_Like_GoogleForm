package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.dto.json.QuestionSaveInfo;
import kg.megacom.test_app.services.QuestionService;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public QuestionDto save(@RequestBody QuestionSaveInfo questionSaveInfo){
        return questionService.save(questionSaveInfo);
    }

    @PutMapping("/update")
    public QuestionDto update(@RequestBody QuestionDto questionDto){
        return questionService.update(questionDto);
    }


    @GetMapping("/getById")
    public QuestionDto findById(@RequestParam Long id){
        return questionService.findById(id);
    }

    @PutMapping("/delete")
    public boolean delete(@RequestBody QuestionDto questionDto){
        return questionService.delete(questionDto);
    }
    @GetMapping("/findAllBySubject")
    public List<QuestionDto> findAllBySubject(@RequestParam Long subjectId){
        SubjectDto subjectDto = subjectService.findById(subjectId);
        return questionService.findAllBySubject(subjectDto);
    }

}
