package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Long> {
//    @Query(value = "select * from tb_question tbq where tbq.subject_id ?1 and tbq.is_active = true",nativeQuery = true)
//    List<Question> findAllBySubjectAndIsActiveTrue(Long subjectId);
//
    @Query(value = "select * from tb_subject tbs where tbs.language_id ?1 and tbs.is_active = true", nativeQuery = true)
    List<Subject> findAllByLanguageAndIsAndActiveTrue(Long languageId);

}
