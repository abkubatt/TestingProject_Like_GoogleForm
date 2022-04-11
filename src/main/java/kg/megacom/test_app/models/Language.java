package kg.megacom.test_app.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_lang")
public class Language {

    @Id
    @GeneratedValue
    private Long id;
    private String name;


}
