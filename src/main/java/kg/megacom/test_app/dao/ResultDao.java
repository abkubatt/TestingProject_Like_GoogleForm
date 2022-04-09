package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultDao extends JpaRepository<Result, Long> {
}
