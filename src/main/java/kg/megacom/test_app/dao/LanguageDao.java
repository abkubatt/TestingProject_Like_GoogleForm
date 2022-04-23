package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageDao extends JpaRepository<Language, Long> {

    @Query("select l from Language l  where l.isActive = true")
    List<Language> findAllByActive();
}
