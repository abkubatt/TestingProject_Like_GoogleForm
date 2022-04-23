package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Long> {
//    select * from Cars c
//    inner join Colours cl  on c.colourID = cl.ID
    //@Query("select q from Question q inner join Subject s on q.subject.id = s.id")
    List<Question> findAllBySubjectAndIsActiveTrue(Subject subjectDto);

}
