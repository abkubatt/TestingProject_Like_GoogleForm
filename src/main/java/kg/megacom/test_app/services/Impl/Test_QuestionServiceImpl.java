package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestDao;
import kg.megacom.test_app.dao.Test_QuestionDao;
import kg.megacom.test_app.models.Test_Question;
import kg.megacom.test_app.services.Test_QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test_QuestionServiceImpl implements Test_QuestionService {

    private Test_QuestionDao test_questionDao;

    @Override
    public Test_Question save() {
        return null;
    }

    @Override
    public Test_Question findById(Long id) {
        return test_questionDao.findById(id).orElse(null);
    }

    @Override
    public Test_Question update(Test_Question test_question) {
        return null;
    }

    @Override
    public Test_Question delete(Test_Question test_question) {
        return null;
    }
}
