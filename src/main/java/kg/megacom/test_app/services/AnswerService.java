package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;

import java.util.List;

public interface AnswerService {

    Answer save(Answer answer);

    Answer findById(Long id);

    Answer update(Answer answer);

    Answer delete(Answer answer);

    List<Answer> findAllByQuestion(Question question);
}
