package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_SubjectDao;
import kg.megacom.test_app.models.Test_Subject;
import kg.megacom.test_app.services.Test_SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

@Service
public class Test_SubjectServiceImpl implements Test_SubjectService {

    private Test_SubjectDao test_subjectDao;

    @Override
    public Test_Subject save() {
        return null;
    }

    @Override
    public Test_Subject findById(Long id) {
        return test_subjectDao.findById(id).orElse(null);
    }

    @Override
    public Test_Subject update(Test_Subject test_subject) {
        return null;
    }

    @Override
    public Test_Subject delete(Test_Subject test_subject) {
        return null;
    }
}
