package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Test_Subject;

public interface Test_SubjectService {

    Test_Subject save();

    Test_Subject findById(Long id);

    Test_Subject update(Test_Subject test_subject);

    Test_Subject delete(Test_Subject test_subject);
}
