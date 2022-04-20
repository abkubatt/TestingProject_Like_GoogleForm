package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.LanguageDao;
import kg.megacom.test_app.mappers.LanguageMapper;
import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    private LanguageMapper languageMapper = LanguageMapper.INSTANCE;

    @Override
    public LanguageDto save(LanguageDto languageDto) {
        Language language = languageMapper.languageDtoToLanguage(languageDto);
        language.set_active(true);
        Language languageSaved = languageDao.save(language);
        return languageMapper.languageToLanguageDto(languageSaved);
    }

    @Override
    public LanguageDto findById(Long id) {
        Language language = languageDao.findById(id).orElse(null);
        return languageMapper.languageToLanguageDto(language);
    }

    @Override
    public LanguageDto update(LanguageDto languageDto) {
        boolean isExist = languageDao.existsById(languageDto.getId());
        if(!isExist){
            return null;
        }else{
            Language language = languageMapper.languageDtoToLanguage(languageDto);
            Language updatedLanguage = languageDao.save(language);
            return languageMapper.languageToLanguageDto(updatedLanguage);
        }

    }

    @Override
    public LanguageDto delete(LanguageDto languageDto) {
        Language language = languageMapper.languageDtoToLanguage(languageDto);
        language.set_active(false);
        LanguageDto deletedLanguageDto = update(languageMapper.languageToLanguageDto(language));
        return deletedLanguageDto;
    }

    @Override
    public List<LanguageDto> findAllByActive() {
        List<Language> languages = languageDao.findAllByActive();
        return languageMapper.languageListToLanguageDtoList(languages);
    }


//    @Override
//    public List<Language> findAllByIs_activeIsTrue() {
//        List<Language> languages = languageDao.findAllByIs_activeIsTrue();
//        return languages;
//    }
//
//    @Override
//    public List<Language> findAllBy_activeTrue() {
//        List<Language> languages2 = languageDao.findAllBy_activeTrue();
//        return languages2;
//    }
    //    @Override
//    public List<Language> findAllByActive() {
//        List<Language> languages = languageDao.findAllByIs_activeIsTrue();
//        return languages;
//    }

}
