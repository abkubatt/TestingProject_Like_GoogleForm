package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;

public interface LanguageService {

    LanguageDto save(LanguageDto languageDto);

    LanguageDto findById(Long id);

    LanguageDto update(LanguageDto languageDto);

    LanguageDto delete(LanguageDto languageDto);



}
