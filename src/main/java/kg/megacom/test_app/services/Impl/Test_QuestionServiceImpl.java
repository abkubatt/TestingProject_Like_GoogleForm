package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_QuestionDao;
import kg.megacom.test_app.models.TestSubjectQuestion;
import kg.megacom.test_app.services.Test_QuestionService;
import org.springframework.stereotype.Service;

@Service
public class Test_QuestionServiceImpl implements Test_QuestionService {

    private Test_QuestionDao test_questionDao;

    @Override
    public TestSubjectQuestion save() {
        return null;
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
