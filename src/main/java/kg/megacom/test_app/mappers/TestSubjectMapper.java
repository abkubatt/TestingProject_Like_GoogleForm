package kg.megacom.test_app.mappers;


import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.TestSubject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestSubjectMapper {

    TestSubjectMapper INSTANCE = Mappers.getMapper(TestSubjectMapper.class);

    TestSubject testSubjectDtoToTestSubject(TestSubjectDto testSubjectDto);

    TestSubjectDto testSubjectToTestSubjectDto(TestSubject testSubject);

    List<TestSubject> testSubjectDtoListToTestSubjectList(List<TestSubjectDto> testSubjectDtos);

    List<TestSubjectDto> testSubjectListToTestSubjectDtoList(List<TestSubject> testSubjects);
}
