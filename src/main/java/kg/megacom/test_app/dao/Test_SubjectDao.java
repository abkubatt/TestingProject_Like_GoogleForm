package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.TestSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Test_SubjectDao extends JpaRepository<TestSubject, Long> {
}
