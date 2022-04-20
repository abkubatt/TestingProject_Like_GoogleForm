package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;

import java.util.List;

public interface SubjectService {

    SubjectDto save(SubjectDto subjectDto);

    SubjectDto findById(Long id);

    SubjectDto update(SubjectDto subjectDto);

    SubjectDto delete(SubjectDto subjectDto);

    List<SubjectDto> findAllByLanguage(Language language);
}
