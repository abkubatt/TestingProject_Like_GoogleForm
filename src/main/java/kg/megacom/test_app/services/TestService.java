package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Test;

public interface TestService {

    Test save();

    Test findById(Long id);

    Test update(Test test);

    Test delete(Test test);
}
