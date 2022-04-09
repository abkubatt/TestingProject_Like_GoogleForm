package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.ResultDao;
import kg.megacom.test_app.models.Result;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    private ResultDao resultDao;

    @Override
    public Result save() {
        return null;
    }

    @Override
    public Result findById(Long id) {
        return resultDao.findById(id).orElse(null);
    }

    @Override
    public Result update(Result result) {
        return null;
    }

    @Override
    public Result delete(Result result) {
        return null;
    }
}
