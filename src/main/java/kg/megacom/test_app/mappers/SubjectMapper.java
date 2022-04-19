package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectMapper {

    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    Subject subjectDtoToSubject(SubjectDto subjectDto);

    SubjectDto subjectToSubjectDto(Subject subject);

    List<Subject> subjectDtoListToSubjectList(List<SubjectDto> subjectDtos);

    List<SubjectDto> subjectListToSubjectDtoList(List<Subject> subjects);
}
