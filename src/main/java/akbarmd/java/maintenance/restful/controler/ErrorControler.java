package akbarmd.java.maintenance.restful.controler;

import akbarmd.java.maintenance.restful.model.WebResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ErrorControler {
    @ExceptionHandler(value = ConstraintViolationException.class)
    WebResponse<String> validationHandle(ConstraintViolationException violationException) {
        return new WebResponse<>(400, "BAD REQUEST", violationException.getMessage());
    }
}
