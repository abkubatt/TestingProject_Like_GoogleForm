package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.QuestionDao;
import kg.megacom.test_app.mappers.QuestionMapper;
import kg.megacom.test_app.mappers.SubjectMapper;
import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.dto.json.AnswerSaveInfo;
import kg.megacom.test_app.models.dto.json.QuestionSaveInfo;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.AnswerService;
import kg.megacom.test_app.services.QuestionService;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


    @Autowired
    private QuestionDao questionDao;
    private QuestionMapper questionMapper = QuestionMapper.INSTANCE;
    private SubjectMapper subjectMapper = SubjectMapper.INSTANCE;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private SubjectService subjectService;

    //@Override
//    public QuestionDto save(QuestionDto questionDto) {
//        Question question = questionMapper.questionDtoToQuestion(questionDto);
//        question.setActive(true);
//        Question questionSaved = questionDao.save(question);
//        return questionMapper.questionToQuestionDto(questionSaved);
//    }

    @Override
    public QuestionDto save(QuestionSaveInfo questionSaveInfo) {
        Question question = new Question();
        question.setActive(true);
        question.setImage(questionSaveInfo.getImage());
        question.setScore(10);
        question.setQuestion(questionSaveInfo.getQuestion());
        question.setSubject(subjectMapper.subjectDtoToSubject(subjectService.findById(questionSaveInfo.getSubjectId())));
        Question questionSaved = questionDao.save(question);

        List<AnswerSaveInfo> answerSaveInfos = questionSaveInfo.getAnswers();
        answerSaveInfos.stream().forEach(x->{
            AnswerDto answerDto = new AnswerDto();
            answerDto.setActive(true);
            answerDto.set_true(x.isTrue());
            answerDto.setAnswer(x.getAnswer());
            answerDto.setQuestion(questionMapper.questionToQuestionDto(questionSaved));
            answerService.save(answerDto);
        });
        return questionMapper.questionToQuestionDto(question);
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
    public boolean delete(QuestionDto question){
        QuestionDto questionDto = findById(question.getId());
        if (questionDto == null) return false;
        List<AnswerDto> answerDtos = answerService.findAllByQuestion(questionDto);
        answerDtos.stream().forEach(x-> {
            x.setActive(false);
            answerService.update(x);
        });
        question.setActive(false);
        QuestionDto deletedQuestion = update(questionDto);
        return deletedQuestion == null ? false : true;
    }


//    @Override
//    public QuestionDto delete(QuestionDto questionDto) {
//        Question question = questionMapper.questionDtoToQuestion(questionDto);
//        question.set_active(false);
//        QuestionDto deletedQuestion = update(questionMapper.questionToQuestionDto(question));
//        return deletedQuestion;
//    }

    @Override
    public List<QuestionDto> findAllBySubject(SubjectDto subjectDto) {
        List<Question> questions = questionDao.findAllBySubjectAndIsActiveTrue(subjectMapper.subjectDtoToSubject(subjectDto));
        return questionMapper.questionListToQuestionDtoList(questions);
    }
}
