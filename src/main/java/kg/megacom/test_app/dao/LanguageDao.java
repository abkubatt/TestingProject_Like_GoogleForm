package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageDao extends JpaRepository<Language, Long> {

    //List<Language> findAllByIs_activeIsTrue();
}
