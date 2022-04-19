package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestSubjectQuestionDao;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import kg.megacom.test_app.services.TestSubjectQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSubjectQuestionServiceImpl implements TestSubjectQuestionService {
    @Autowired
    private TestSubjectQuestionDao testSubjectQuestionDao;


    @Override
    public TestSubjectQuestion save(TestSubjectQuestion testSubjectQuestion) {
        TestSubjectQuestion testSubjectQuestionSaved = testSubjectQuestionDao.save(testSubjectQuestion);
        return testSubjectQuestionSaved;
    }

    @Override
    public TestSubjectQuestion findById(Long id) {
        return testSubjectQuestionDao.findById(id).orElse(null);
    }

    @Override
    public TestSubjectQuestion update(TestSubjectQuestion testSubjectQuestion){
        boolean isExists = testSubjectQuestionDao.existsById(testSubjectQuestion.getId());
        if (!isExists){
            return null;
        }else{
            TestSubjectQuestion  updatedTestSubjectQuestion1 = testSubjectQuestionDao.save(testSubjectQuestion);
            return updatedTestSubjectQuestion1;
        }
    }

    @Override
    public TestSubjectQuestion delete(TestSubjectQuestion testSubjectQuestion) {
        return null;
    }
}
