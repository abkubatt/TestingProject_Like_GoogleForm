package kg.megacom.test_app.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "tb_result")
public class Result {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;
    private String testUser;
    private String result;
    private Date date;


}
