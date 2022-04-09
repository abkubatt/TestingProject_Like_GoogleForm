package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.QuestionDao;
import kg.megacom.test_app.models.Question;
import kg.megacom.test_app.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {


    private QuestionDao questionDao;

    @Override
    public Question save() {
        return null;
    }

    @Override
    public Question findById(Long id) {
        return questionDao.findById(id).orElse(null);
    }

    @Override
    public Question update(Question question) {
        return null;
    }

    @Override
    public Question delete(Question question) {
        return null;
    }
}
