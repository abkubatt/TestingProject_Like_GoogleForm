package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.entities.TestSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestSubjectDao extends JpaRepository<TestSubject, Long> {
}
