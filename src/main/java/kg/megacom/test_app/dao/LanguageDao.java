package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDao extends JpaRepository<Language, Long> {
}
