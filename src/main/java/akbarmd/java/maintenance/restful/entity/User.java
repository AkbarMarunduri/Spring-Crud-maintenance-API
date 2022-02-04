package akbarmd.java.maintenance.restful.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User {

    @Id
    @Column(name = "id_user")
    private String idUser;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "level_user")
    private String levelUser;

    @Column(name = "status")
    private String status;

}
