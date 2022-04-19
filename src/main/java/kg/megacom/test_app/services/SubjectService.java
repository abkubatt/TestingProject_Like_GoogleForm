package kg.megacom.test_app.services;

import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;

import java.util.List;

public interface SubjectService {

    Subject save(Subject subject);

    Subject findById(Long id);

    Subject update(Subject subject);

    Subject delete(Subject subject);

    List<Subject> findAllByLanguage(Language language);
}
