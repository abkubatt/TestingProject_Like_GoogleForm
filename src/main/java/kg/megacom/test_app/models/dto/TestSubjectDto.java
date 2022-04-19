package kg.megacom.test_app.models.dto;

import lombok.Data;


@Data
public class TestSubjectDto {
    private Long id;
    private SubjectDto subject;
    private TestDto test;
    private int questionAmount;
}
