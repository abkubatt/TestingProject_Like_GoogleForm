package kg.megacom.test_app.models.dto;

import lombok.Data;

@Data
public class TestSubjectQuestionDto {
    private Long id;
    private QuestionDto question;
    private TestSubjectDto testSubject;
    private boolean isActive;
}
