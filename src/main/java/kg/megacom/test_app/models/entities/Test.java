package kg.megacom.test_app.models.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_test")
public class Test {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String navi_user;
    @Column
    private boolean active;

}
