package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.AnswerDao;
import kg.megacom.test_app.models.Answer;
import kg.megacom.test_app.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public Answer save() {
        return null;
    }

    @Override
    public Answer findById(Long id) {
        return answerDao.findById(id).orElse(null);
    }

    @Override
    public Answer update(Answer answer) {
        return null;
    }

    @Override
    public Answer delete(Answer answer) {
        return null;
    }
}
