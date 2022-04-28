package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.dto.json.QuestionSaveInfo;
import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.Subject;

import java.util.List;

public interface QuestionService {

    QuestionDto save(QuestionSaveInfo questionSaveInfo);

    QuestionDto findById(Long id);

    QuestionDto update(QuestionDto questionDto);

    boolean delete(QuestionDto questionDto);

    List<QuestionDto> findAllBySubject(SubjectDto subjectDto);

    List<QuestionDto> findQuestionsRandomly(SubjectDto subjectDto, int QuestionAmount);
}
