package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;
import org.apache.catalina.LifecycleState;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LanguageMapper {

    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    Language languageDtoToLanguage(LanguageDto languageDto);

    LanguageDto languageToLanguageDto(Language language);

    List<Language> languageDtoListToLanguageList(List<LanguageDto> languageDtos);

    List<LanguageDto> languageListToLanguageDtoList(List<Language> languages);

}
