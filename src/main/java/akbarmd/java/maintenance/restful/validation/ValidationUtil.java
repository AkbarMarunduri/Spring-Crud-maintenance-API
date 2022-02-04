package akbarmd.java.maintenance.restful.validation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.Set;

@Component
@AllArgsConstructor
public class ValidationUtil {

    private Validator validator;

    public <T> void validate(T any) {
        Set<ConstraintViolation<T>> result = validator.validate(any);
        if (result.size() != 0) {
            throw new ConstraintViolationException(result);
        }
    }
}
