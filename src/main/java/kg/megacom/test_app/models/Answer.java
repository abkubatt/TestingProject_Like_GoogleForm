package kg.megacom.test_app.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_answer")
public class Answer {

    @Id
    @GeneratedValue
    private Long id;
    private String answer;
    private boolean is_true;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    private boolean is_active;

    
}
