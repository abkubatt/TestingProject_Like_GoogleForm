package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Test;

import java.util.List;

public interface TestService {

    Test save(Test test);

    Test findById(Long id);

    Test update(Test test);

    Test delete(Test test);

    List<Test> findAllByActive();
}
