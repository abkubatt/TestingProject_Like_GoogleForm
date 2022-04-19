package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDao extends JpaRepository<Language, Long> {
//
//    List<Language>  findAllByIs_activeIsTrue();
//
//    List<Language> findAllBy_activeTrue();
}
