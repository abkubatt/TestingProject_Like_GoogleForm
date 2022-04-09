package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Subject;

public interface SubjectService {

    Subject save();

    Subject findById(Long id);

    Subject update(Subject subject);

    Subject delete(Subject subject);
}
