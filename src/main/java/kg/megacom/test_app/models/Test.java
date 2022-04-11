package kg.megacom.test_app.models;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_test")
public class Test {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String navi_user;

}
