package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test, Long> {

}
