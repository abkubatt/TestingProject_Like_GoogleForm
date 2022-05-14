package kg.megacom.test_app.models.dto.json.check;

import lombok.Data;

@Data
public class ResultSubject {
    private Long subjectId;
    private String name;
    private int totalQuestionsBySubject;
    private int correctQuestions;
}
