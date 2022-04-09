package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Test_Question;

public interface Test_QuestionService {

    Test_Question save();

    Test_Question findById(Long id);

    Test_Question update(Test_Question test_question);

    Test_Question delete(Test_Question test_question);
}
