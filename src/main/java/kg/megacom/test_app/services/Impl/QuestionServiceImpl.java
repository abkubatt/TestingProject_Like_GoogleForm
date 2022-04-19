package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.QuestionDao;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


    @Autowired
    private QuestionDao questionDao;


    @Override
    public Question save(Question question) {
        question.set_active(true);
        Question questionSaved = questionDao.save(question);
        return questionSaved;
    }

    @Override
    public Question findById(Long id) {
        return questionDao.findById(id).orElse(null);
    }

    @Override
    public Question update(Question question) {
        boolean isExists = questionDao.existsById(question.getId());
        if (!isExists){
            return null;
        }
        else{
            Question updatedQuestion = questionDao.save(question);
            return updatedQuestion;
        }
    }

    @Override
    public Question delete(Question question) {
        question.set_active(false);
        Question deletedQuestion = update(question);
        return deletedQuestion;
    }

    @Override
    public List<Question> findAllBySubject(Subject subject) {
        return null;
    }
}
