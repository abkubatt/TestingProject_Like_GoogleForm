package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.LanguageDao;
import kg.megacom.test_app.models.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public Language save(Language language) {
        language.set_active(true);
        Language languageSaved = languageDao.save(language);
        return languageSaved;
    }

    @Override
    public Language findById(Long id) {
        return languageDao.findById(id).orElse(null);
    }

    @Override
    public Language update(Language language) {
        boolean isExist = languageDao.existsById(language.getId());
        //Language languageFromDb = findById(language.getId());
        if(!isExist){
            return null;
        }else{
            Language updatedLanguage = languageDao.save(language);
            return updatedLanguage;
        }

    }

    @Override
    public Language delete(Language language) {
        language.set_active(false);
        Language deletedLanguage = update(language);
        return deletedLanguage;
    }

//    @Override
//    public List<Language> findAllByActive() {
//        List<Language> languages = languageDao.findAllByIs_activeIsTrue();
//        return languages;
//    }
}
