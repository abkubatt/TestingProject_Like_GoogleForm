package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_QuestionDao;
import kg.megacom.test_app.models.TestSubjectQuestion;
import kg.megacom.test_app.services.TestSubjectQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSubjectQuestionServiceImpl implements TestSubjectQuestionService {
    @Autowired
    private Test_QuestionDao test_questionDao;


    @Override
    public TestSubjectQuestion save(TestSubjectQuestion testSubjectQuestion) {
        TestSubjectQuestion testSubjectQuestionSaved = test_questionDao.save(testSubjectQuestion);
        return testSubjectQuestionSaved;
    }

    @Override
    public TestSubjectQuestion findById(Long id) {
        return test_questionDao.findById(id).orElse(null);
    }

    @Override
    public TestSubjectQuestion update(TestSubjectQuestion test_Subject_question) {
        return null;
    }

    @Override
    public TestSubjectQuestion delete(TestSubjectQuestion test_Subject_question) {
        return null;
    }
}
