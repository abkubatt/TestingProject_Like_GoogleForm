package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestDao;
import kg.megacom.test_app.models.Test;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private TestDao testDao;

    @Override
    public Test save() {
        return null;
    }

    @Override
    public Test findById(Long id) {
        return testDao.findById(id).orElse(null);
    }

    @Override
    public Test update(Test test) {
        return null;
    }

    @Override
    public Test delete(Test test) {
        return null;
    }
}
