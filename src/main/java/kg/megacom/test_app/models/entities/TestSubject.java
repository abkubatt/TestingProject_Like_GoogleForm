package kg.megacom.test_app.models.entities;

import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.models.entities.Test;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_test_subject")
public class TestSubject {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;
    private int questionAmount;


}
