package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public QuestionDto save(@RequestBody QuestionDto questionDto){
        return questionService.save(questionDto);
    }

    @PutMapping("/update")
    public QuestionDto update(@RequestBody QuestionDto questionDto){
        return questionService.update(questionDto);
    }


    @GetMapping("/get")
    public QuestionDto findById(@RequestParam Long id){
        return questionService.findById(id);
    }

    @PutMapping("/delete")
    public QuestionDto delete(@RequestBody QuestionDto questionDto){
        return questionService.delete(questionDto);
    }
    @GetMapping("/list")
    public List<QuestionDto> findAllBySubject(Subject subject){
        return null;
    }



}
