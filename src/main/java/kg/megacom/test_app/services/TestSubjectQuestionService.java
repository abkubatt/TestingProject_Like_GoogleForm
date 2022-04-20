package kg.megacom.test_app.services;


import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;

public interface TestSubjectQuestionService {

    TestSubjectQuestionDto save(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto findById(Long id);

    TestSubjectQuestionDto update(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto delete(TestSubjectQuestionDto testSubjectQuestionDto);

}
