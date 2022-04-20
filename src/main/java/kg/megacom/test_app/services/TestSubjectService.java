package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestSubjectDto;

public interface TestSubjectService {

    TestSubjectDto save(TestSubjectDto testSubjectDto);

    TestSubjectDto findById(Long id);

    TestSubjectDto update(TestSubjectDto testSubjectDto);

    TestSubjectDto delete(TestSubjectDto testSubjectDto);
}
