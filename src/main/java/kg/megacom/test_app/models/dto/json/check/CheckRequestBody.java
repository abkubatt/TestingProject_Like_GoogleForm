package kg.megacom.test_app.models.dto.json.check;

import lombok.Data;

import java.util.List;

@Data
public class CheckRequestBody {
    private Long testId;
    private List<CheckRequestQuestion> questions;
}








