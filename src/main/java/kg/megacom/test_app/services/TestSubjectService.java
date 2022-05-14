package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.dto.TestSubjectDto;

import java.util.List;

public interface TestSubjectService {

    TestSubjectDto save(TestSubjectDto testSubjectDto);

    TestSubjectDto findById(Long id);

    TestSubjectDto update(TestSubjectDto testSubjectDto);

    TestSubjectDto delete(TestSubjectDto testSubjectDto);

    List<TestSubjectDto> findAllByTest(TestDto testDto);
    TestSubjectDto findByTestAndSubject(TestDto testDto, SubjectDto subjectDto);

}
