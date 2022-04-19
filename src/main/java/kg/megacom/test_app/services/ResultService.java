package kg.megacom.test_app.services;

import kg.megacom.test_app.models.entities.Result;

public interface ResultService {

    Result save(Result result);

    Result findById(Long id);


}
