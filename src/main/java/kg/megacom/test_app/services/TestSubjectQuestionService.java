package kg.megacom.test_app.services;

import kg.megacom.test_app.models.TestSubjectQuestion;

public interface TestSubjectQuestionService {

    TestSubjectQuestion save(TestSubjectQuestion testSubjectQuestion);

    TestSubjectQuestion findById(Long id);

    TestSubjectQuestion update(TestSubjectQuestion test_Subject_question);

    TestSubjectQuestion delete(TestSubjectQuestion test_Subject_question);


}
