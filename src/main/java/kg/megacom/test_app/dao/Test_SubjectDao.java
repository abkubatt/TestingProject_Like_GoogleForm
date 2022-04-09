package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.Test_Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Test_SubjectDao extends JpaRepository<Test_Subject, Long> {
}
