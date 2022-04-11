package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_SubjectDao;
import kg.megacom.test_app.models.TestSubject;
import kg.megacom.test_app.services.Test_SubjectService;
import org.springframework.stereotype.Service;

@Service
public class Test_SubjectServiceImpl implements Test_SubjectService {

    private Test_SubjectDao test_subjectDao;

    @Override
    public TestSubject save() {
        return null;
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
