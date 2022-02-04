package akbarmd.java.maintenance.restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserRespose {

    private String idUser;

    private String email;

    private String password;

    private String levelUser;

    private String status;


}
