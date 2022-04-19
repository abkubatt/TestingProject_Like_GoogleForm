package kg.megacom.test_app.models.entities;

import kg.megacom.test_app.models.entities.Question;
import kg.megacom.test_app.models.entities.TestSubject;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_test_sub_question")
public class TestSubjectQuestion {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    @ManyToOne
    @JoinColumn(name = "test_sub_id")
    private TestSubject testSubject;


}
