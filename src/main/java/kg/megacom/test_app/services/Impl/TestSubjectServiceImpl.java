package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_SubjectDao;
import kg.megacom.test_app.models.TestSubject;
import kg.megacom.test_app.services.TestSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSubjectServiceImpl implements TestSubjectService {
    @Autowired
    private Test_SubjectDao test_subjectDao;


    @Override
    public TestSubject save(TestSubject testSubject) {
        TestSubject testSubjectSaved = test_subjectDao.save(testSubject);
        return testSubjectSaved;
    }

    @Override
    public TestSubject findById(Long id) {
        return test_subjectDao.findById(id).orElse(null);
    }

    @Override
    public TestSubject update(TestSubject test_subject) {
        return null;
    }

    @Override
    public TestSubject delete(TestSubject test_subject) {
        return null;
    }
}
