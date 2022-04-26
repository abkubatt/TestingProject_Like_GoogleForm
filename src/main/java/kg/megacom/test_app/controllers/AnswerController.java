package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.services.AnswerService;
import kg.megacom.test_app.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;
    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public AnswerDto save(@RequestBody AnswerDto answerDto){
        return answerService.save(answerDto);
    }

    @GetMapping("/getById")
    public AnswerDto findById(@RequestParam Long id){
        return answerService.findById(id);
    }

    @PutMapping("/update")
    public AnswerDto update(@RequestBody AnswerDto answerDto){
        return answerService.update(answerDto);
    }

    @PutMapping("/delete")
    public AnswerDto delete(@RequestBody AnswerDto answerDto){
        return answerService.delete(answerDto);
    }


    @GetMapping("/findAllByQuestion")
    public List<AnswerDto> findAllByQuestion(@RequestParam Long questionId){
        QuestionDto questionDto = questionService.findById(questionId);
        return answerService.findAllByQuestion(questionDto);
    }

}
