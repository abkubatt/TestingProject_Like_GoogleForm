package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Answer;

public interface AnswerService {

    Answer save();

    Answer findById(Long id);

    Answer update(Answer answer);

    Answer delete(Answer answer);
}
