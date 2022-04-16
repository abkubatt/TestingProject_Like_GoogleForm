package kg.megacom.test_app.services;

import kg.megacom.test_app.models.TestSubject;

public interface TestSubjectService {

    TestSubject save(TestSubject testSubject);

    TestSubject findById(Long id);

    TestSubject update(TestSubject test_subject);

    TestSubject delete(TestSubject test_subject);
}
