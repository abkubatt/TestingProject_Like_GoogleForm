package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.TestSubjectQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test_QuestionDao extends JpaRepository<TestSubjectQuestion, Long> {
}
