package kg.megacom.test_app.services;


import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;

import java.util.List;

public interface TestSubjectQuestionService {

    TestSubjectQuestionDto save(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto findById(Long id);

    TestSubjectQuestionDto update(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto delete(TestSubjectQuestionDto testSubjectQuestionDto);

    List<TestSubjectQuestionDto> findAllByTestSubject(TestSubjectDto testSubjectDto);

    List<TestSubjectQuestionDto> findAllByQuestion(QuestionDto questionDto);

}
