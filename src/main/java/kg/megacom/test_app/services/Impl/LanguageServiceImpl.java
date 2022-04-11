package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.LanguageDao;
import kg.megacom.test_app.models.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public Language save() {
        return null;
    }

    @Override
    public Language findById(Long id) {
        return languageDao.findById(id).orElse(null);
    }

    @Override
    public Language update(Language language) {
        return null;
    }

    @Override
    public Language delete(Language language) {
        return null;
    }
}
