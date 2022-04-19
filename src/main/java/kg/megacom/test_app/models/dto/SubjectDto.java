package kg.megacom.test_app.models.dto;

import lombok.Data;


@Data
public class SubjectDto {
    private Long id;
    private String title;
    private String description;
    private boolean is_active;
    private LanguageDto language;
}
