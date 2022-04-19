package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping("/save")
    public String toSaveAnswer(){
        Answer answer = new Answer();
        answer.setAnswer("private");
        answer.set_active(true);
        answer.setQuestion(new Question());
        answer.set_true(true);

        Answer savedAnswer = answerService.save(answer);
        return savedAnswer.getAnswer();
    }
}
