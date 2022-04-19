package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.AnswerDao;
import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public Answer save(Answer answer) {
        answer.set_active(true);
        Answer answerSaved = answerDao.save(answer);
        return answerSaved;
    }

    @Override
    public Answer findById(Long id) {
        return answerDao.findById(id).orElse(null);
    }

    @Override
    public Answer update(Answer answer) {
        boolean isExists = answerDao.existsById(answer.getId());
        if (!isExists){
            return null;
        }else{
            Answer updatedAnswer = answerDao.save(answer);
            return updatedAnswer;
        }
    }

    @Override
    public Answer delete(Answer answer) {
        answer.set_active(false);
        Answer deletedAnswer = update(answer);
        return deletedAnswer;
    }

    @Override
    public List<Answer> findAllByQuestion(Question question) {
        return null;
    }

}
