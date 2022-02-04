package akbarmd.java.maintenance.restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class WebResponse<T> {
    private int code;

    private String status;

    private T data;
}
