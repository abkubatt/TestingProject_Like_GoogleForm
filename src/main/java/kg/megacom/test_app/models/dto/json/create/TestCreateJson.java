package kg.megacom.test_app.models.dto.json.create;

import kg.megacom.test_app.models.dto.json.create.SubjectJson;
import lombok.Data;

import java.util.List;

@Data
public class TestCreateJson {

    private Long languageId;
    private String name;
    private String  author;
    private List<SubjectJson> subjectJsons;

}
