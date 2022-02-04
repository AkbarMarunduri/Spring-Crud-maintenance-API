package akbarmd.java.maintenance.restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@Setter
@Getter
public class EquipmentResponse {
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
