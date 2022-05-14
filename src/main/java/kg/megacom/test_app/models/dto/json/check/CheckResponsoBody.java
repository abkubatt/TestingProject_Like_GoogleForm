package kg.megacom.test_app.models.dto.json.check;

import lombok.Data;

import java.util.List;

@Data
public class CheckResponsoBody {
    private int status;
    private String message;
    private String testName;
    private int totalQuestions;
    private int correctAnsweredQuestions;
    private List<ResultSubject> subjects;
}
