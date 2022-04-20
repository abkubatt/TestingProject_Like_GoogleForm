package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao extends JpaRepository<Test, Long> {
    @Query("select t from Test t  where t.active = true")
    List<Test> findAllByActive();

}
