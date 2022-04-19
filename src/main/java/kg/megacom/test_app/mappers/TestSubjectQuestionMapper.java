package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestSubjectQuestionMapper {

    TestSubjectQuestionMapper INSTANCE = Mappers.getMapper(TestSubjectQuestionMapper.class);

    TestSubjectQuestion testSubjectQuestionDtoToTestSubjectQuestion(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto testSubjectQuestionToTestSubjectQuestionDto(TestSubjectQuestion testSubjectQuestion);

    List<TestSubjectQuestion> testSubjectQuestionDtoListToTestSubjectQuestionList(List<TestSubjectQuestionDto> testSubjectQuestionDtos);

    List<TestSubjectQuestionDto> testSubjectQuestionListToTestSubjectQuestionDtoList(List<TestSubjectQuestion> testSubjectQuestions);
}
