package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.ResultDao;
import kg.megacom.test_app.mappers.ResultMapper;
import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultDao resultDao;
    private ResultMapper resultMapper = ResultMapper.INSTANCE;


    @Override
    public ResultDto save(ResultDto resultDto) {
        Result result = resultMapper.resultDtoToResult(resultDto);
        result.setActive(true);
        Result resultSaved = resultDao.save(result);
        return resultMapper.resultToResultDto(resultSaved);
    }

    @Override
    public ResultDto findById(Long id) {
        Result result = resultDao.findById(id).orElse(null);
        return resultMapper.resultToResultDto(result);
    }

    @Override
    public ResultDto update(ResultDto resultDto) {
        boolean isExists = resultDao.existsById(resultDto.getId());
        if (!isExists){
            return null;
        }else {
            Result result = resultMapper.resultDtoToResult(resultDto);
            Result updatedResult = resultDao.save(result);
            return resultMapper.resultToResultDto(updatedResult);
        }
    }

    @Override
    public ResultDto delete(ResultDto resultDto) {
        Result result = resultMapper.resultDtoToResult(resultDto);
        result.setActive(false);
        ResultDto deletedResult = update(resultMapper.resultToResultDto(result));
        return deletedResult;
    }


}
