package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestDao;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;


    @Override
    public Test save(Test test) {
        test.setActive(true);
        Test testSaved = testDao.save(test);
        return testSaved;
    }

    @Override
    public Test findById(Long id) {
        return testDao.findById(id).orElse(null);
    }

    @Override
    public Test update(Test test) {
        boolean isExists = testDao.existsById(test.getId());
        if (!isExists){
            return null;
        }else{
            Test updatedTest = testDao.save(test);
            return updatedTest;
        }
    }

    @Override
    public Test delete(Test test) {
        test.setActive(false);
        Test deletedTest = update(test);
        return deletedTest;
    }

    @Override
    public List<Test> findAllByActive() {
        return null;
    }
}
