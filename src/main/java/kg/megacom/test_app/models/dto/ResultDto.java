package kg.megacom.test_app.models.dto;

import lombok.Data;


import java.util.Date;
@Data
public class ResultDto {
    private Long id;
    private TestDto test;
    private String testUser;
    private String result;
    private Date date;
    private boolean isActive;
}
