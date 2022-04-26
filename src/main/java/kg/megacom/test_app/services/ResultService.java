package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.ResultDto;

public interface ResultService {

    ResultDto save(ResultDto resultDto);

    ResultDto findById(Long id);
    ResultDto update(ResultDto resultDto);

    ResultDto delete(ResultDto resultDto);


}
