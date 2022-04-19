package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.entities.Result;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ResultMapper {

    ResultMapper INSTANCE = Mappers.getMapper(ResultMapper.class);

    Result resultDtoToResult(ResultDto resultDto);

    ResultDto resultToResultDto(Result result);

    List<Result> resultDtoListToResultList(List<ResultDto> resultDtos);

    List<ResultDto> resultListToResultDtoList(List<Result> results);
}
