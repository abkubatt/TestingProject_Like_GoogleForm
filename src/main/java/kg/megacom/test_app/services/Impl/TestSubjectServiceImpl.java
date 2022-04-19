package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestSubjectDao;
import kg.megacom.test_app.models.entities.TestSubject;
import kg.megacom.test_app.services.TestSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSubjectServiceImpl implements TestSubjectService {
    @Autowired
    private TestSubjectDao testSubjectDao;


    @Override
    public TestSubject save(TestSubject testSubject) {
        TestSubject testSubjectSaved = testSubjectDao.save(testSubject);
        return testSubjectSaved;
    }

    @Override
    public TestSubject findById(Long id) {
        return testSubjectDao.findById(id).orElse(null);
    }

    @Override
    public TestSubject update(TestSubject testSubject){
        boolean isExists = testSubjectDao.existsById(testSubject.getId());
        if (!isExists){
            return null;
        }else{
            TestSubject updatedTestSubject = testSubjectDao.save(testSubject);
            return updatedTestSubject;
        }
    }

    @Override
    public TestSubject delete(TestSubject test_subject) {
        return null;
    }
}
