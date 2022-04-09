package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Question;

public interface QuestionService {

    Question save();

    Question findById(Long id);

    Question update(Question question);

    Question delete(Question question);
}
