package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerDao extends JpaRepository<Answer, Long> {

    @Query(value = "select * from tb_answer tba where tba.question_id = ?1 and tba.is_active = true", nativeQuery = true)
    List<Answer> findAllByQuestionAndActiveTrue(Long questionId);
    @Query(value = "select * from tb_answer a where a.question_id = ?1 and a.is_active = true and is_true = true", nativeQuery = true)
    List<Answer> findAllByQuestionAnd_trueAndActive(Long questionId);


}
