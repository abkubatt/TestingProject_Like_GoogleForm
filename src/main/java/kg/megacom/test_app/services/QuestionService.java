package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.entities.Subject;

import java.util.List;

public interface QuestionService {

    QuestionDto save(QuestionDto questionDto);

    QuestionDto findById(Long id);

    QuestionDto update(QuestionDto questionDto);

    QuestionDto delete(QuestionDto questionDto);

    List<QuestionDto> findAllBySubject(Subject subject);
}
