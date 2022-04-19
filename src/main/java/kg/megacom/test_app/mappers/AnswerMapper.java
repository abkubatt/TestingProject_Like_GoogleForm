package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.entities.Answer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnswerMapper {

    AnswerMapper INSTANCE = Mappers.getMapper(AnswerMapper.class);

    Answer answerDtoToAnswer(AnswerDto answerDto);

    AnswerDto answerToAnswerDto(Answer answer);

    List<Answer> answerDtoListToAnswerList(List<AnswerDto> answerDtos);

    List<AnswerDto> answerListToAnswerDtoList(List<Answer> answers);
}
