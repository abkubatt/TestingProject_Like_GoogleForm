package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.QuestionDao;
import kg.megacom.test_app.mappers.QuestionMapper;
import kg.megacom.test_app.models.dto.QuestionDto;
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
    private QuestionMapper questionMapper = QuestionMapper.INSTANCE;

    @Override
    public QuestionDto save(QuestionDto questionDto) {
        Question question = questionMapper.questionDtoToQuestion(questionDto);
        question.set_active(true);
        Question questionSaved = questionDao.save(question);
        return questionMapper.questionToQuestionDto(questionSaved);
    }

    @Override
    public QuestionDto findById(Long id) {
        Question question = questionDao.findById(id).orElse(null);
        return questionMapper.questionToQuestionDto(question);
    }

    @Override
    public QuestionDto update(QuestionDto questionDto) {
        boolean isExists = questionDao.existsById(questionDto.getId());
        if (!isExists){
            return null;
        }
        else{
            Question question = questionMapper.questionDtoToQuestion(questionDto);
            Question updatedQuestion = questionDao.save(question);
            return questionMapper.questionToQuestionDto(updatedQuestion);
        }
    }

    @Override
    public QuestionDto delete(QuestionDto questionDto) {
        Question question = questionMapper.questionDtoToQuestion(questionDto);
        question.set_active(false);
        QuestionDto deletedQuestion = update(questionMapper.questionToQuestionDto(question));
        return deletedQuestion;
    }

    @Override
    public List<QuestionDto> findAllBySubject(Subject subject) {
        List<Question> questions = questionDao.findAllBySubject(subject);
        return questionMapper.questionListToQuestionDtoList(questions);
    }
}
