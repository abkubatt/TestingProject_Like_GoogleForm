package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.ResultDao;
import kg.megacom.test_app.mappers.ResultMapper;
import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultDao resultDao;
    private ResultMapper resultMapper = ResultMapper.INSTANCE;


    @Override
    public ResultDto save(ResultDto resultDto) {
        Result result = resultMapper.resultDtoToResult(resultDto);
        Result resultSaved = resultDao.save(result);
        return resultMapper.resultToResultDto(resultSaved);
    }

    @Override
    public ResultDto findById(Long id) {
        Result result = resultDao.findById(id).orElse(null);
        return resultMapper.resultToResultDto(result);
    }


}
