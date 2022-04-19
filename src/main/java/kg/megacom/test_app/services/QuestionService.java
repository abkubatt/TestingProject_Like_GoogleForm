package kg.megacom.test_app.services;

import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;

import java.util.List;

public interface QuestionService {

    Question save(Question question);

    Question findById(Long id);

    Question update(Question question);

    Question delete(Question question);

    List<Question> findAllBySubject(Subject subject);
}
