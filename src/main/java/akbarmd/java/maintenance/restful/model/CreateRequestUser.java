package akbarmd.java.maintenance.restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Setter
@Getter
public class CreateRequestUser {

    @NotBlank
    private String id;

    @NotBlank
    private String email;

    @NotBlank
    private String status;
}
