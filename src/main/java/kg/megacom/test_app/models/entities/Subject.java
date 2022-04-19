package kg.megacom.test_app.models.entities;

import kg.megacom.test_app.models.entities.Language;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_subject")
public class Subject {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private boolean is_active;
    @ManyToOne
    @JoinColumn(name = "lang_id")
    private Language language;

}
