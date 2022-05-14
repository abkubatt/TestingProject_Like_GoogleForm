package kg.megacom.test_app.models.dto.json.check;

import lombok.Data;

@Data
public class CheckRequestQuestion {
    private Long questionId;
    private Long subjectId;
    private Long answerId;
}
