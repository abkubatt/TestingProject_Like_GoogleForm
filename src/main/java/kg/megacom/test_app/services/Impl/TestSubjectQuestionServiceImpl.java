package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestSubjectQuestionDao;
import kg.megacom.test_app.mappers.TestSubjectMapper;
import kg.megacom.test_app.mappers.TestSubjectQuestionMapper;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import kg.megacom.test_app.services.TestSubjectQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestSubjectQuestionServiceImpl implements TestSubjectQuestionService {
    @Autowired
    private TestSubjectQuestionDao testSubjectQuestionDao;
    private TestSubjectMapper testSubjectMapper = TestSubjectMapper.INSTANCE;
    private TestSubjectQuestionMapper testSubjectQuestionMapper = TestSubjectQuestionMapper.INSTANCE;
    @Override
    public TestSubjectQuestionDto save(TestSubjectQuestionDto testSubjectQuestionDto) {
        TestSubjectQuestion testSubjectQuestion = testSubjectQuestionMapper.testSubjectQuestionDtoToTestSubjectQuestion(testSubjectQuestionDto);
        testSubjectQuestion.setActive(true);
        TestSubjectQuestion testSubjectQuestionSaved = testSubjectQuestionDao.save(testSubjectQuestion);
        return testSubjectQuestionMapper.testSubjectQuestionToTestSubjectQuestionDto(testSubjectQuestionSaved);
    }

    @Override
    public TestSubjectQuestionDto findById(Long id) {
        TestSubjectQuestion testSubjectQuestion =  testSubjectQuestionDao.findById(id).orElse(null);
        return testSubjectQuestionMapper.testSubjectQuestionToTestSubjectQuestionDto(testSubjectQuestion);
    }

    @Override
    public TestSubjectQuestionDto update(TestSubjectQuestionDto testSubjectQuestionDto){
        boolean isExists = testSubjectQuestionDao.existsById(testSubjectQuestionDto.getId());
        if (!isExists){
            return null;
        }else{
            TestSubjectQuestion testSubjectQuestion = testSubjectQuestionMapper.testSubjectQuestionDtoToTestSubjectQuestion(testSubjectQuestionDto);
            TestSubjectQuestion  updatedTestSubjectQuestion = testSubjectQuestionDao.save(testSubjectQuestion);
            return testSubjectQuestionMapper.testSubjectQuestionToTestSubjectQuestionDto(updatedTestSubjectQuestion);
        }
    }

    @Override
    public TestSubjectQuestionDto delete(TestSubjectQuestionDto testSubjectQuestionDto) {
        TestSubjectQuestion testSubjectQuestion = testSubjectQuestionMapper.testSubjectQuestionDtoToTestSubjectQuestion(testSubjectQuestionDto);
        testSubjectQuestion.setActive(false);
        TestSubjectQuestionDto deletedTestSubjectQuestion = update(testSubjectQuestionMapper.testSubjectQuestionToTestSubjectQuestionDto(testSubjectQuestion));
        return deletedTestSubjectQuestion;
    }

    @Override
    public List<TestSubjectQuestionDto> findAllByTestSubject(TestSubjectDto testSubjectDto) {
        List<TestSubjectQuestion> testSubjectQuestions = testSubjectQuestionDao.findAllByTestSubject(testSubjectMapper.testSubjectDtoToTestSubject(testSubjectDto));
        return testSubjectQuestionMapper.testSubjectQuestionListToTestSubjectQuestionDtoList(testSubjectQuestions);
    }

    @Override
    public List<TestSubjectQuestionDto> findAllByQuestion(QuestionDto questionDto) {
        List<TestSubjectQuestion> testSubjectQuestions = testSubjectQuestionDao.findAllByQuestion(questionDto.getId());
        return testSubjectQuestionMapper.testSubjectQuestionListToTestSubjectQuestionDtoList(testSubjectQuestions);
    }
}
