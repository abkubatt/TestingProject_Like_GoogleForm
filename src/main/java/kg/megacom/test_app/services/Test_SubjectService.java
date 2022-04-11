package kg.megacom.test_app.services;

import kg.megacom.test_app.models.TestSubject;

public interface Test_SubjectService {

    TestSubject save();

    TestSubject findById(Long id);

    TestSubject update(TestSubject test_subject);

    TestSubject delete(TestSubject test_subject);
}
