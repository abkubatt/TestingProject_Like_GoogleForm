package kg.megacom.test_app.models.json;

import lombok.Data;

import java.util.List;

@Data
public class TestCreateJson {

    private Long languageId;
    private String name;
    private String  author;
    private List<SubjectJson> subjectJsons;

}
