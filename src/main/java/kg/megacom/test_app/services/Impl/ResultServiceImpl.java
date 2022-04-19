package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.ResultDao;
import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultDao resultDao;


    @Override
    public Result save(Result result) {
        Result resultSaved = resultDao.save(result);
        return resultSaved;
    }

    @Override
    public Result findById(Long id) {
        return resultDao.findById(id).orElse(null);
    }


}
