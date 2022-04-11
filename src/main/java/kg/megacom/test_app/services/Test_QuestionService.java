package kg.megacom.test_app.services;

import kg.megacom.test_app.models.TestSubjectQuestion;

public interface Test_QuestionService {

    TestSubjectQuestion save();

    TestSubjectQuestion findById(Long id);

    TestSubjectQuestion update(TestSubjectQuestion test_Subject_question);

    TestSubjectQuestion delete(TestSubjectQuestion test_Subject_question);
}
