package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.models.entities.TestSubject;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestSubjectQuestionDao extends JpaRepository<TestSubjectQuestion, Long> {
   // @Query(value = "select * from tb_test_sub_question sq where sq.test_sub_id ?1 and sq.is_active = true", nativeQuery = true)
    List<TestSubjectQuestion> findAllByTestSubject(TestSubject testSubject);


    @Query(value = "select * from tb_test_sub_question s where s.question_id ?1 and s.is_active = true", nativeQuery = true)
    List<TestSubjectQuestion> findAllByQuestion(Long questionId);

}
