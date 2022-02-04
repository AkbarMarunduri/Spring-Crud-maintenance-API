package akbarmd.java.maintenance.restful.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipments")
@Setter
@Getter
public class Equipment {

    @Id
    private String noEqupment;

    @Column(name = "description")
    private String description;

    @Column(name = "merk")
    private String merk;

    @Column(name = "model")
    private String model;

    @Column(name = "tahun")
    private String tahun;



}
