package kg.megacom.test_app.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_question")
public class Question {

    @Id
    @GeneratedValue
    private Long id;
    private String question;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private boolean isActive;
    private String image;
    private int score;


}
