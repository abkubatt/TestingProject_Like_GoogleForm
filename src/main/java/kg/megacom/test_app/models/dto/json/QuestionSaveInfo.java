package kg.megacom.test_app.models.dto.json;

import lombok.Data;

import java.util.List;

@Data
public class QuestionSaveInfo {
    private Long subjectId;
    private String question;
    private String image;
    private List<AnswerSaveInfo> answers;
}
